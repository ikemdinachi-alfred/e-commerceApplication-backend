package com.alfredtech.ecormerceapplication.service;

import com.alfredtech.ecormerceapplication.model.AppUser;

import java.util.List;

public interface UserService {
    String simpleLogin(String passwords, String email);

    AppUser findByEmail(String email);

    List<AppUser> findAllUser(String token);

    String bookRoom(String token, int money);
}
