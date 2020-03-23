package com.nsc.tdd.service;

import com.nsc.tdd.AppUtils;
import com.nsc.tdd.exception.MandatoryParametersMissingException;
import com.nsc.tdd.model.User;
import com.nsc.tdd.repository.UserRepository;

import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User add(User user) throws Exception {

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
        throw new Exception("Unable to add User. Please try again later");
    }

    public User add(String userId, String userName) throws Exception {
        // Argument Captor, we will capture and verify in test class
        User user = new User(userId, userName);
        User userResult = userRepository.insert(user);
        return userResult;
    }

    public String getApplicationName() {
        // we will use PowerMock to mock invocation to static method
        return AppUtils.getAppName();
    }

    public User createUser() {
        // we will use this to test PowerMock - Replacing object instantiation
        User user = new User("", "");
        return user;
    }

    public int getUserCount() {
        return userRepository.getUserCount();
    }
}
