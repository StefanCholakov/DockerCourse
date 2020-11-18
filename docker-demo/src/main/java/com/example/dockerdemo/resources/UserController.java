package com.example.dockerdemo.resources;

import com.example.dockerdemo.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


    @GetMapping("/users")
    public ResponseEntity<List<User>> getRepositoryById(HttpServletRequest request) {
        List<User> allUsers = getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }


    private List<User> getAllUsers(){
        User george = new User("George",15,"Sofia");
        User peter = new User("Petar",40,"Burgas");
        User niki = new User("Nikolai",25,"Plovdiv");
        List<User> allUsers = new ArrayList<>();
        allUsers.add(george);
        allUsers.add(peter);
        allUsers.add(niki);
        return allUsers;
    }
}
