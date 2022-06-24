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
        Iterable<User> all = userRepository.findAll();
        all.forEach(user -> {
            System.out.println(user);
            userList.add(user);
        });

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
        userRepository.save(user);
        return user;
    }

    public User deleteUser(int id) {
        User user = userList.stream().filter(e->e.getId()==id).findFirst().get();
        userList.remove(user);
        return user;
    }
}
