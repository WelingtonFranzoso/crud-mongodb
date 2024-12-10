package com.franzoso.crud_mongodb.infrastructure.entity;

import java.time.LocalDateTime;

public class UserBuilder {

    private User user;

    private UserBuilder() {
        user = new User();
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public UserBuilder id(String id) {
        this.user.setId(id);
        return this;
    }

    public UserBuilder name(String name) {
        this.user.setName(name);
        return this;
    }

    public UserBuilder email(String email) {
        this.user.setEmail(email);
        return this;
    }

    public UserBuilder document(String document) {
        this.user.setDocument(document);
        return this;
    }

    public UserBuilder creationTimestamp(LocalDateTime creationTimestamp) {
        this.user.setCreationTimestamp(creationTimestamp);
        return this;
    }

    public User build() {
        return this.user;
    }
}
