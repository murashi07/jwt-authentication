package com.jwt.jwt_authentication.responses;

import lombok.Data;
@Data
public class LoginResponse {

    private String token;

    private long expiresIn;

    public LoginResponse(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }
}
