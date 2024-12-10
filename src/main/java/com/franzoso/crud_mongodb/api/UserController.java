package com.franzoso.crud_mongodb.api;

import com.franzoso.crud_mongodb.api.request.UserRequestDTO;
import com.franzoso.crud_mongodb.api.response.UserResponseDTO;
import com.franzoso.crud_mongodb.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> saveUsers(@RequestBody UserRequestDTO userRequestDTO) {
        return ResponseEntity.ok(userService.saveUsers(userRequestDTO));
    }

    @GetMapping
    public ResponseEntity<UserResponseDTO> findByEmail(@RequestParam ("email") String email) {
        return ResponseEntity.ok(userService.findByEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteByEmail(@RequestParam ("email") String email) {
        userService.deleteByEmail(email);
        return ResponseEntity.accepted().build();
    }
}
