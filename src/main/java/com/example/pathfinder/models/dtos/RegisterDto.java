package com.example.pathfinder.models.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterDto {
    private Integer age;
    private String username;
    private String password;
    private String confirmPassword;
    private String fullName;
    private String email;
}
