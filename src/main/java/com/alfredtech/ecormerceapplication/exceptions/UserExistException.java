package com.alfredtech.ecormerceapplication.exceptions;

public class UserExistException extends RuntimeException {
    public UserExistException(String message){
        super(message);
    }
}
