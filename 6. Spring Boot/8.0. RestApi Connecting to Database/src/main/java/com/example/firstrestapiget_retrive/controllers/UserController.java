package com.example.firstrestapiget_retrive.controllers;

import com.example.firstrestapiget_retrive.Entity.User;
import com.example.firstrestapiget_retrive.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

/*
@Controller
@ResponseBody
*/
@RestController // As it is rest API
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping("/users") // value + method = get
    public List<User> getUsers() {
        List<User> userList = this.userService.getAllUser();
        return userList;
    }

    @GetMapping("/users/{userID}")
    public ResponseEntity<User> getSingleUser(@PathVariable("userID") int id) {
        User user = this.userService.getOneUser(id);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(user);
    }

    @PostMapping("/users/addone")
    public User addSingleUser(@RequestBody User user) {
        User user1 = this.userService.addOneUser(user);
        return user1;
    }

    @DeleteMapping("/users/delete/{userID}")
    public User deleteUser(@PathVariable("userID") int id) {
        User user = this.userService.deleteUser(id);
        return user;
    }

}
