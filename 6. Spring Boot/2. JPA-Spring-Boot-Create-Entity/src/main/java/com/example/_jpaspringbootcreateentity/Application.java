package com.example._jpaspringbootcreateentity;
import com.example._jpaspringbootcreateentity.DAO.UserRepository;
import com.example._jpaspringbootcreateentity.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        User user = new User("Rakib2", "Dhaka2", "Java Developer2");
        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

}
