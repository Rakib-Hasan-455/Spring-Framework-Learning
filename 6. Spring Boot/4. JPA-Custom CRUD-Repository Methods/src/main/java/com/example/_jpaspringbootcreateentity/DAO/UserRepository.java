package com.example._jpaspringbootcreateentity.DAO;

import com.example._jpaspringbootcreateentity.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// Visit to have more idea
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findUserByName(String name);
    public List<User> findUserByNameAndCity(String name, String city);
    public List<User> findUserByIdGreaterThanAndIdLessThan(int id1, int id2);

    // JPQL = Java Persistance Query Language
    @Query("SELECT u from User u")
    public List<User> getAllUser();

    @Query("SELECT u from User u WHERE u.name = :n")
    public List<User> getUserByName(@Param("n") String name);

    @Query(value = "SELECT * FROM USER", nativeQuery = true)
    public List<User> getAllUserNative();

    @Query(value = "SELECT * FROM USER WHERE NAME = :n", nativeQuery = true)
    public List<User> getUserByNameNative(@Param("n") String name);
}
