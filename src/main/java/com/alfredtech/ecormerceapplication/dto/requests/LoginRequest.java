package com.alfredtech.ecormerceapplication.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest {
    private String password;
    private String emailAddress;

}
