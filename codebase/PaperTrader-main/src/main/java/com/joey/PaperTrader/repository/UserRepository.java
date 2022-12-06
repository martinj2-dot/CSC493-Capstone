package com.joey.PaperTrader.repository;

import com.joey.PaperTrader.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);

//    Optional<User> findByUsernameAndPassword(String username, String user_password);

    boolean existsByUsername(String username);
}
