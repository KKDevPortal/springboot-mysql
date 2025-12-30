package com.kkdevportal.springboot_mysql.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserDAOImpl implements IUserDAO{
    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteuser(String userId) {
        User user = userRepository.findByUserId(userId);

        Optional<User> optionalUser = Optional.ofNullable(user);

        if (optionalUser.isEmpty()) {
            System.out.println("User not found");
        } else {
            System.out.println("User found: " + optionalUser.get());
            userRepository.delete(user);
        }

    }

    @Override
    public User updateuser(String userId, User user) {
        User existingUser = userRepository.findByUserId(userId);

        Optional<User> optionalUser = Optional.ofNullable(existingUser);

        if (optionalUser.isEmpty()) {
            System.out.println("User not found");
            return null;
        } else {
            System.out.println("User found: " + optionalUser.get());
            return userRepository.save(user);
        }

    }
}
