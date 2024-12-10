package com.franzoso.crud_mongodb.business;

import com.franzoso.crud_mongodb.api.converter.UserConverter;
import com.franzoso.crud_mongodb.api.converter.UserMapper;
import com.franzoso.crud_mongodb.api.request.UserRequestDTO;
import com.franzoso.crud_mongodb.api.response.UserResponseDTO;
import com.franzoso.crud_mongodb.infrastructure.entity.Address;
import com.franzoso.crud_mongodb.infrastructure.entity.User;
import com.franzoso.crud_mongodb.infrastructure.exceptions.BusinessException;
import com.franzoso.crud_mongodb.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.util.Assert.notNull;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AddressService addressService;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public UserResponseDTO saveUsers(UserRequestDTO userRequestDTO) {
        try {
            notNull(userRequestDTO, "User data is mandatory");
            User user = saveUser(userConverter.toUser(userRequestDTO));
            Address address = addressService.saveAddress(userConverter.toAddress(userRequestDTO.getAddress(), user.getId()));
            return userMapper.toUserResponseDTO(user, address);
        }
        catch (Exception e) {
            throw new BusinessException("Error saving user data");
        }
    }

    public UserResponseDTO findByEmail(String email) {
        try {
            User user = userRepository.findByEmail(email);
            notNull(user, "User not found!");
            Address address = addressService.findByUserId(user.getId());
            return userMapper.toUserResponseDTO(user, address);
        }
        catch (Exception e) {
            throw new BusinessException("Error finding user data");
        }
    }

    @Transactional
    public void deleteByEmail(String email) {
        User user = userRepository.findByEmail(email);
        userRepository.deleteByEmail(email);
        addressService.deleteByUserId(user.getId());
    }
}
