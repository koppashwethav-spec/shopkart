package com.shopkart.shopkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return null;
        }
        return userRepository.save(user);
    }

    public User login(String email, String password) {
        return userRepository.findByEmail(email)
            .filter(u -> u.getPassword().equals(password))
            .orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User updated) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setFullName(updated.getFullName());
            user.setPhone(updated.getPhone());
            user.setAddress(updated.getAddress());
            return userRepository.save(user);
        }
        return null;
    }
}
