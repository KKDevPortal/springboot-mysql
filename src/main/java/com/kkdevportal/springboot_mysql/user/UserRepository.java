package com.kkdevportal.springboot_mysql.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserId(String userId);
}
