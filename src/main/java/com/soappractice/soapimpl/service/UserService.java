package com.soappractice.soapimpl.service;

import com.mp.spring_boot_soap.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User userOne = new User();
        userOne.setName("Manish");
        userOne.setEmpId(1111);
        userOne.setSalary(120000);

        User userTwo = new User();
        userTwo.setName("Ronaldo");
        userTwo.setEmpId(1112);
        userTwo.setSalary(100000);

        User userThree = new User();
        userThree.setName("Messi");
        userThree.setEmpId(1113);
        userThree.setSalary(50000);

        users.put(userOne.getName(), userOne);
        users.put(userTwo.getName(), userTwo);
        users.put(userThree.getName(), userThree);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}
