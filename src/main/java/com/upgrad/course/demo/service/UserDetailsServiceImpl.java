package com.upgrad.course.demo.service;

import com.upgrad.course.demo.entity.User;
import com.upgrad.course.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;



    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
