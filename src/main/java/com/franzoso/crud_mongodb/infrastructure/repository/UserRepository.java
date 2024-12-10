package com.franzoso.crud_mongodb.infrastructure.repository;

import com.franzoso.crud_mongodb.infrastructure.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository  extends MongoRepository<User, String> {

    User findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
