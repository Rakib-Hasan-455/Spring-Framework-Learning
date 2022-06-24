package com.example.firstrestapiget_retrive.dao;

import com.example.firstrestapiget_retrive.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User, Integer> {

}
