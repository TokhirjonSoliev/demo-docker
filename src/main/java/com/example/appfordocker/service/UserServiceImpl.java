package com.example.appfordocker.service;

import com.example.appfordocker.utils.ApiResponse;
import com.example.appfordocker.entity.Users;
import com.example.appfordocker.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository ;

    @Override
    public ApiResponse<?> getAll() {
        return new ApiResponse<>(200, userRepository.findAll());
    }

    @Override
    public ApiResponse<?> getById(Long id) {
        return new ApiResponse<>(200, userRepository.findById(id));
    }

    @Override
    public ApiResponse<?> save(Users user) {
        return new ApiResponse<>(200, userRepository.save(user));
    }

    @Override
    public ApiResponse<?> delete(Long id) {
        userRepository.deleteById(id);
        return new ApiResponse<>(200);
    }

    @Override
    public ApiResponse<?> edit(Long id, Users newUser) {
        Users oldUser = userRepository.findById(id).get();
        oldUser.setName(newUser.getName());
        userRepository.save(oldUser);
        return new ApiResponse<>(200, oldUser);
    }
}
