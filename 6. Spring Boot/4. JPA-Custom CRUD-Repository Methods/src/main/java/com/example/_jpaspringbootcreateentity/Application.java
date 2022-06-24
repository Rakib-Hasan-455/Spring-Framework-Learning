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


        // Retrive
        // Retrive by ID

    /*    Iterable<User> userRepositoryAll = userRepository.findUserByName("Rakib1");
        userRepositoryAll.forEach(System.out::println);

        Iterable<User> userRepositoryAll2 = userRepository.findUserByNameAndCity("Rakib2", "Dhaka2");
        userRepositoryAll2.forEach(System.out::println);

        System.out.println();
        Iterable<User> userRepositoryAll3 = userRepository.findUserByIdGreaterThanAndIdLessThan(8, 12);
        userRepositoryAll3.forEach(System.out::println);*/

        // JPQL
        System.out.println("JPQL");
        Iterable<User> userRepositoryAll4 = userRepository.getAllUser();
        userRepositoryAll4.forEach(System.out::println);
        System.out.println();
        Iterable<User> userRepositoryAll5 = userRepository.getUserByName("Rakib1");
        userRepositoryAll5.forEach(System.out::println);
        System.out.println();

        // Native Query
        System.out.println("NATIVE SQL");
        Iterable<User> userRepositoryAll6 = userRepository.getAllUserNative();
        userRepositoryAll6.forEach(System.out::println);
        System.out.println();
        Iterable<User> userRepositoryAll7 = userRepository.getUserByNameNative("Rakib2");
        userRepositoryAll7.forEach(System.out::println);

    }
}
