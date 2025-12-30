package com.kkdevportal.springboot_mysql.user;

import java.util.List;

public interface IUserService {
    public List<User> getAllUser();
    public  User saveUser(User user);
    public void deleteuser(String userId);
    public User updateuser(String userId, User user);
}
