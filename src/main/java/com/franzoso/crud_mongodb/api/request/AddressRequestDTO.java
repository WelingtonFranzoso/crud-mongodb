package com.franzoso.crud_mongodb.api.request;

import java.util.Objects;

public class AddressRequestDTO {

    private String street;

    private Long number;

    private String neighborhood;

    private String addressComplement;

    private String city;

    private String zipCode;

    public AddressRequestDTO() {
    }

    public AddressRequestDTO(String street, Long number, String neighborhood, String addressComplement, String city, String zipCode) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.addressComplement = addressComplement;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddressComplement() {
        return addressComplement;
    }

    public void setAddressComplement(String addressComplement) {
        this.addressComplement = addressComplement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
