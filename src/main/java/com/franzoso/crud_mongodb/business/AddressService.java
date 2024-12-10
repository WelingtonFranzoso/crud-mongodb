package com.franzoso.crud_mongodb.business;

import com.franzoso.crud_mongodb.infrastructure.entity.Address;
import com.franzoso.crud_mongodb.infrastructure.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address findByUserId(String userId) {
        return addressRepository.findByUserId(userId);
    }

    public void deleteByUserId(String userId) {
        addressRepository.deleteByUserId(userId);
    }
}