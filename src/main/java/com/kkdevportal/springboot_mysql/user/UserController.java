package com.kkdevportal.springboot_mysql.user;

import com.kkdevportal.springboot_mysql.ResponseEnvelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/users")
    public ResponseEnvelope getUsers() {
        ResponseEnvelope response = new ResponseEnvelope();
        response.setData(userService.getAllUser());
        response.setHttpStatus(HttpStatus.OK);
        response.setCreatedOn(new Date());
        
        return response;
    }

    @PostMapping("/users")
    public ResponseEnvelope saveUsers(@RequestBody User user) {
        ResponseEnvelope response = new ResponseEnvelope();
        response.setData(userService.saveUser(user));
        response.setHttpStatus(HttpStatus.OK);
        response.setCreatedOn(new Date());

        return response;
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEnvelope deleteUsers(@PathVariable String userId) {
        ResponseEnvelope response = new ResponseEnvelope();
        userService.deleteuser(userId);
        response.setData("User deleted successfully");
        response.setHttpStatus(HttpStatus.OK);
        response.setCreatedOn(new Date());

        return response;
    }

    @PutMapping("/users/{userId}")
    public ResponseEnvelope updateUsers(@PathVariable String userId, @RequestBody User user) {
        ResponseEnvelope response = new ResponseEnvelope();
        response.setData(userService.updateuser(userId, user));
        response.setHttpStatus(HttpStatus.OK);
        response.setCreatedOn(new Date());

        return response;
    }
}
