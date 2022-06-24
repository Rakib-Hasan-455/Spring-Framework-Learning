package com.example._jpaspringbootcreateentity.DAO;

import com.example._jpaspringbootcreateentity.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// Visit to have more idea
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findUserByName(String name);
    public List<User> findUserByNameAndCity(String name, String city);
    public List<User> findUserByIdGreaterThanAndIdLessThan(int id1, int id2);
}
