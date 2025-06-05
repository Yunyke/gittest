package com.example.demo.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.demo.service.UserRegisterService;
@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    @Override
    public void addUser(Integer id,
                        String name,
                        String username,
                        String password,
                        LocalDate birthdate,
                        String gender,
                        String email) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        user.setBirthdate(birthdate);
        user.setGender(gender);
        user.setEmail(email);

        userRepository.save(user);
    }
}