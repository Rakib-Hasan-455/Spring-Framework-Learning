package com.example.firstrestapiget_retrive.services;

import com.example.firstrestapiget_retrive.Entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Component
@Service
public class UserService {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "Rakib", "Dhaka", "Java Dev"));
        userList.add(new User(2, "Jahid", "Dhaka", "C# Dev"));
        userList.add(new User(3, "Sanjana", "Dhaka", "Data Science"));
        userList.add(new User(4, "Mursalin", "Dhaka", "Java Dev"));
    }

    public static List<User> getAllUser() {
        return userList;
    }

    public static User getOneUser(int id) {
        User user = userList.stream().filter(e->e.getId()==id).findFirst().get();
        return user;
    }
}
