package com.example._jpaspringbootcreateentity.DAO;

import com.example._jpaspringbootcreateentity.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
