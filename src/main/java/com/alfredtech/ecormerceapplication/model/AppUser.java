package com.alfredtech.ecormerceapplication.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private  String phoneNumber;
    private String emailAddress;
    private String nameOfCompany;
    private String country;
    private String password;
    @Enumerated
    private  Role role;

}
