package com.alfredtech.ecormerceapplication.util;

import com.alfredtech.ecormerceapplication.dto.requests.RegisterUserRequest;
import com.alfredtech.ecormerceapplication.model.AppUser;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Mapper {
    public static AppUser map(RegisterUserRequest registerUserRequest, Class<AppUser> appUserClass){
        AppUser appUser = new AppUser();
        appUser.setUserName(registerUserRequest.getUsername());
        appUser.setPassword(registerUserRequest.getPassword());
        appUser.setCountry(registerUserRequest.getCountry());
        appUser.setEmailAddress(registerUserRequest.getEmailAddress());
        appUser.setRole(registerUserRequest.getRole());
        return appUser;

    }
}
