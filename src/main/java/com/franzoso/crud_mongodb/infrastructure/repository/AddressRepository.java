package com.franzoso.crud_mongodb.infrastructure.repository;

import com.franzoso.crud_mongodb.infrastructure.entity.Address;
import com.franzoso.crud_mongodb.infrastructure.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface AddressRepository extends MongoRepository<Address, String> {

    Address findByUserId(String userId);

    @Transactional
    void deleteByUserId(String userId);
}
