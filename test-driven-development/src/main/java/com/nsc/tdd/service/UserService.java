package com.nsc.tdd.service;

import com.nsc.tdd.exception.MandatoryParametersMissingException;
import com.nsc.tdd.model.User;
import com.nsc.tdd.repository.UserRepository;

import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User add(User user) {

        Optional<User> userOptional = Optional.ofNullable(user);
        userOptional.orElseThrow(() -> new MandatoryParametersMissingException("User can't be null"));

        User userResult;
        userResult = userRepository.insert(user);
        Optional<User> userResultOptional = Optional.ofNullable(userResult);
        // we will spy this in test class
        if (userResultOptional.isPresent()) {
            User user1 = userResultOptional.get();
            User createdUser = new User(user1.getId(), user1.getName());
            return createdUser;
        }
        return null;
    }
}
