package com.alfredtech.ecormerceapplication.dto.requests;

import com.alfredtech.ecormerceapplication.model.Role;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUserRequest {
    private String username;
    private String phoneNumber;
    private String emailAddress;
    private String password;
    private String country;
    @Enumerated
    public Role role;
}
