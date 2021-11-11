package com.model.user;

import lombok.Data;

@Data
public abstract class User {
    private String userId;
    private String name;
}
