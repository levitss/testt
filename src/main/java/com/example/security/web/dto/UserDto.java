package com.example.security.web.dto;

import com.example.security.persistence.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String id;
    private String password;
    private String name;
    public User toEntity() {
        return User.builder().id(id).password(password).name(name).build();
    }
}
