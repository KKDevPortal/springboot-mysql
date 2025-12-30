package com.kkdevportal.springboot_mysql.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public User saveUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        user.setCreatedOn(new Date());
        return userDAO.saveUser(user);
    }

    @Override
    public void deleteuser(String userId) {
        userDAO.deleteuser(userId);
    }

    @Override
    public User updateuser(String userId, User user) {
        return userDAO.updateuser(userId, user);
    }
}
