package com.franzoso.crud_mongodb.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.franzoso.crud_mongodb.infrastructure.entity.User;

import java.util.Objects;

public class UserRequestDTO {

    private String name;

    @JsonProperty(required = true)
    private String email;

    private String document;

    private AddressRequestDTO address;

    public UserRequestDTO() {
    }

    public UserRequestDTO(String name, String email, String document, AddressRequestDTO address) {
        this.name = name;
        this.email = email;
        this.document = document;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public AddressRequestDTO getAddress() {
        return address;
    }

    public void setAddress(AddressRequestDTO address) {
        this.address = address;
    }

}