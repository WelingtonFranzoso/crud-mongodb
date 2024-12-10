package com.franzoso.crud_mongodb.infrastructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "address_entity")
public class Address {

    @Id
    private String id;
    private String userId;
    private String street;
    private Long number;
    private String neighborhood;
    private String addressComplement;
    private String city;
    private String zipCode;

    protected Address() {
    }

    public static Address builder() {
        return new Address();
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    protected void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStreet() {
        return street;
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    public Long getNumber() {
        return number;
    }

    protected void setNumber(Long number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    protected void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    protected void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    protected void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}