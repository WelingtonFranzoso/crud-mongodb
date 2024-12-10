package com.franzoso.crud_mongodb.infrastructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "user_entity")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String document;
    private LocalDateTime creationTimestamp;
    private LocalDateTime updateTimestamp;

    protected User() {
    }

    public static User builder() {
        return new User();
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    protected void setDocument(String document) {
        this.document = document;
    }

    public LocalDateTime getCreationTimestamp() {
        return creationTimestamp;
    }

    protected void setCreationTimestamp(LocalDateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    protected void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}
