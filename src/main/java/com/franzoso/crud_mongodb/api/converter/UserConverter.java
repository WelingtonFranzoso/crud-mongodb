package com.franzoso.crud_mongodb.api.converter;

import com.franzoso.crud_mongodb.api.request.AddressRequestDTO;
import com.franzoso.crud_mongodb.api.request.UserRequestDTO;
import com.franzoso.crud_mongodb.infrastructure.entity.Address;
import com.franzoso.crud_mongodb.infrastructure.entity.AddressBuilder;
import com.franzoso.crud_mongodb.infrastructure.entity.User;
import com.franzoso.crud_mongodb.infrastructure.entity.UserBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class UserConverter {

    public User toUser(UserRequestDTO userRequestDTO) {
        return UserBuilder.builder()
                .id(UUID.randomUUID().toString())
                .name(userRequestDTO.getName())
                .document(userRequestDTO.getDocument())
                .email(userRequestDTO.getEmail())
                .creationTimestamp(LocalDateTime.now()).build();
    }

    public Address toAddress(AddressRequestDTO addressRequestDTO, String userId) {
        return AddressBuilder.builder()
                .street(addressRequestDTO.getStreet())
                .neighborhood(addressRequestDTO.getNeighborhood())
                .userId(userId)
                .zipCode(addressRequestDTO.getZipCode())
                .city(addressRequestDTO.getCity())
                .number(addressRequestDTO.getNumber())
                .addressComplement(addressRequestDTO.getAddressComplement()).build();
    }
}
