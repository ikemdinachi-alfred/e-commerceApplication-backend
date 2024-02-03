package com.alfredtech.ecormerceapplication.implimentation;

import com.alfredtech.ecormerceapplication.dto.requests.RegisterUserRequest;
import com.alfredtech.ecormerceapplication.dto.requests.UserRequest;
import com.alfredtech.ecormerceapplication.exceptions.UserExistException;
import com.alfredtech.ecormerceapplication.model.AppUser;
import com.alfredtech.ecormerceapplication.repository.userRepository.UserRepository;
import com.alfredtech.ecormerceapplication.service.UserService;
import com.alfredtech.ecormerceapplication.util.ApiResponse;
import com.alfredtech.ecormerceapplication.util.GenerateApiResponse;
import com.alfredtech.ecormerceapplication.util.Mapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

import static com.alfredtech.ecormerceapplication.util.ApiResponse.create;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserImplementationService implements UserService {
    private final UserRepository userRepository;
    @Autowired
    private AppUser appUser;

    private void validateUser(String token){
        String decodeToken = decryptPassword(token);
        if (!decodeToken.contains(".")) throw new RuntimeException("invalid token");
        int beforeTheDot = decodeToken.indexOf('.');
        String userEmail = decodeToken.substring(0,beforeTheDot);
        log.info(userEmail+"      ^^^^^^^^^^^^^^ this is user email <<<<<<<<<<<<<<<<<<<<");
        String role = decodeToken.substring(beforeTheDot);
        log.info(role+"  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<< this role");
        if (!userRepository.existsByEmailAddress(userEmail)){
            throw new RuntimeException("you can access the end point please register");
        }
    }
    private void validateAdmin(String token){
        String decodeToken = decryptPassword(token);
        if (!decodeToken.contains(".")) throw new RuntimeException("invalid token");
        int beforeTheDot = decodeToken.indexOf('.');
        String userEmail = decodeToken.substring(0,beforeTheDot);
        log.info(userEmail+"      ^^^^^^^^^^^^^^ this is user email <<<<<<<<<<<<<<<<<<<<");
        String role = decodeToken.substring(beforeTheDot);
        log.info(role+"  <<<<<<<<<<<<<<<<<<<<<<<<<<<< this role");
        AppUser foundAppUser = findByEmail(userEmail);
        if (!foundAppUser.getRole().name().equalsIgnoreCase("ADMIN"))
            throw new RuntimeException("only admin can access this end point");
    }


    @Override
    public String simpleLogin(String password, String email) {
        AppUser foundUser = findByEmail(email);
        if (!foundUser.getPassword().equalsIgnoreCase(password)){
            throw new RuntimeException("invalid password");
        }
        return tokenGenerator(foundUser);
    }
    private String tokenGenerator(AppUser user){
        String userEmail = user.getEmailAddress();
        String userRole = user.getRole().name();
        String detail = userEmail+"."+userRole;
        return encryptPassword(detail);
    }

    private String encryptPassword(String password) {
        if (password.contains(" ")) throw new RuntimeException("Encrypt  password()-->  invalid password input");
        byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes(StandardCharsets.UTF_8));
        return new String(encodedBytes);
    }

    public String decryptPassword(String encodedPassword) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedPassword.getBytes(StandardCharsets.UTF_8));
        return new String(decodedBytes);
    }

    @Override
    public AppUser findByEmail(String email) {
        AppUser foundUser = userRepository.findByEmailAddress(email);
        if (foundUser == null) throw new RuntimeException("User not found");
        return   foundUser;
    }

    @Override
    public List<AppUser> findAllUser(String token) {
        validateAdmin(token);
        return userRepository.findAll();
    }





    @Override
        public ApiResponse registerAdminUser(RegisterUserRequest registerUserRegister) throws UserExistException {
        if (checkIfUserExist(registerUserRegister.getPassword()))
            throw  new UserExistException(GenerateApiResponse.USER_ALREADY_EXIST);
        AppUser appUser = Mapper.map(registerUserRegister,AppUser.class);
        userRepository.save(appUser);
        return ApiResponse.create(GenerateApiResponse.USER_SUCCESSFULLY_REGISTERED);

    }

    private boolean checkIfUserExist(String email){
        AppUser  appUser = userRepository.findByEmailAddress(email);
        return appUser != null;

    }


}
