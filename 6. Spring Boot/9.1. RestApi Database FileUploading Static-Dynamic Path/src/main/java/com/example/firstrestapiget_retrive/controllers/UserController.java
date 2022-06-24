package com.example.firstrestapiget_retrive.controllers;

import com.example.firstrestapiget_retrive.Entity.User;
import com.example.firstrestapiget_retrive.helper.FileUploadHelper;
import com.example.firstrestapiget_retrive.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @Autowired
    private FileUploadHelper fileUploadHelper;
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
        User user = this.userService.getOneUser(id);
        this.userService.deleteUser(id);
        return user;
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile) {
        try {
            if (multipartFile.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File Can't be empty");
        }

        if (!(multipartFile.getContentType().equals("image/jpeg"))) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File should be images");
        }
            boolean boolvalue = fileUploadHelper.uploadFile(multipartFile);
            if (boolvalue) {
                return ResponseEntity.ok(ServletUriComponentsBuilder.
                        fromCurrentContextPath().
                        path("/uploadedImages/").
                        path(multipartFile.getOriginalFilename()).
                        toUriString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Please Check your file");
    }


}
