package com.example._jpaspringbootcreateentity;
import com.example._jpaspringbootcreateentity.DAO.UserRepository;
import com.example._jpaspringbootcreateentity.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

        // Create
        // Inserting 1 data
        User user1 = new User("Rakib1", "Dhaka1", "Java Developer1");
        userRepository.save(user1);

        // Inserting list of data (2 or more)
        User user2 = new User("Rakib2", "Dhaka2", "Java Developer2");
        User user3 = new User("Rakib3", "Dhaka3", "Java Developer3");
        List<User> userList1 = List.of(user2, user3);

        Iterable<User> users = userRepository.saveAll(userList1);
        // printing
        users.forEach(System.out::println);

        // Retrive
        // Retrive by ID
        Optional<User> userRepositoryById = userRepository.findById(11);
        User user = userRepositoryById.get();
        System.out.println(user);
        Iterable<User> userRepositoryAll = userRepository.findAll();
        userRepositoryAll.forEach(System.out::println);

        // Update
        Optional<User> userRepositoryById1 = userRepository.findById(11);
        User user4 = userRepositoryById1.get();
        user4.setName("Rakibbb Updated");
        userRepository.save(user4);

        // Delete

        // delete one
        /*int id = 11;
        userRepository.deleteById(id);
        System.out.println("Deleted "+id);

        // delete all
        userRepository.deleteAll();;
        System.out.println("All deleted");*/
    }
}
