package com.example.endpoint.endpoints.Service;

import com.example.endpoint.endpoints.Entity.User;
import com.example.endpoint.endpoints.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;


    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

//    public Page<User> getUser1(int page, int size){
//        Pageable pageable = PageRequest.of(page, size, Sort.by("name").descending());
//
//        return userRepository.findById(pageable);
//    }

    public User getUser(Long id) {

        return userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
    }

    public User createUser(User user) {

        if(user.getSalary()<=0){
            throw new RuntimeException("Salary should be be greater by zero");
        }

        return  userRepository.save(user);
    }
}
