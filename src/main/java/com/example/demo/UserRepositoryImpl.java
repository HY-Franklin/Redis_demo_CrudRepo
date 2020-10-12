package com.example.demo;


import com.example.demo.model.User;
import com.example.demo.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserRepositoryImpl implements UserRepository {

   private UserRepo userRepo;

   @Autowired
   public UserRepositoryImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public Map<String, User> findAll() {
        return null;
    }

    @Override
    public User findById(String id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void update(User user) {
        save(user);
    }

    @Override
    public void delete(String id) {

    }
}
