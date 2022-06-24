package com.example.firstrestapiget_retrive.services;

import com.example.firstrestapiget_retrive.Entity.User;
import com.example.firstrestapiget_retrive.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private List<User> userList = new ArrayList<>();


    public List<User> getAllUser() {
        userList = (List<User>) userRepository.findAll();
        return userList;
    }

    public User getOneUser(int id) {
        User user = null;
        try {
            Optional<User> userOP = userRepository.findById(id);
            user = userOP.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public User addOneUser(User user) {
        System.out.println(user);
        userRepository.save(user);
        return user;
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
     }
}
