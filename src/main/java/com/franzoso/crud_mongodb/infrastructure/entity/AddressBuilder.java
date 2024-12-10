package com.franzoso.crud_mongodb.infrastructure.entity;

import java.time.LocalDateTime;

public class AddressBuilder {

    private Address address;

    private AddressBuilder() {
        address = new Address();
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public AddressBuilder id(String id) {
        this.address.setId(id);
        return this;
    }
    public AddressBuilder userId(String userId) {
        this.address.setUserId(userId);
        return this;
    }
    public AddressBuilder street(String street) {
        this.address.setStreet(street);
        return this;
    }
    public AddressBuilder number(Long number) {
        this.address.setNumber(number);
        return this;
    }
    public AddressBuilder neighborhood(String neighborhood) {
        this.address.setNeighborhood(neighborhood);
        return this;
    }
    public AddressBuilder addressComplement(String addressComplement) {
        this.address.setAddressComplement(addressComplement);
        return this;
    }
    public AddressBuilder city(String city) {
        this.address.setCity(city);
        return this;
    }
    public AddressBuilder zipCode(String zipCode) {
        this.address.setZipCode(zipCode);
        return this;
    }


    public Address build() {
        return this.address;
    }
}
