package com.jwt.jwt_authentication.dto;

import lombok.Data;

@Data
public class LoginUserDto {
    private String email;
    private String password;
}
