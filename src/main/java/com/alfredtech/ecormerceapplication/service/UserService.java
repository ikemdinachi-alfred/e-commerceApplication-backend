package com.alfredtech.ecormerceapplication.service;

import com.alfredtech.ecormerceapplication.dto.requests.RegisterUserRequest;
import com.alfredtech.ecormerceapplication.exceptions.UserExistException;
import com.alfredtech.ecormerceapplication.model.AppUser;
import com.alfredtech.ecormerceapplication.util.ApiResponse;

import java.util.List;

public interface UserService {
    String simpleLogin(String passwords, String email);

    AppUser findByEmail(String email);

    List<AppUser> findAllUser(String token);

    ApiResponse registerAdminUser(RegisterUserRequest registerUserRegister) throws UserExistException;
}
