package com.example.appfordocker.service;

import com.example.appfordocker.utils.ApiResponse;
import com.example.appfordocker.entity.Users;

public interface UserService {

    public ApiResponse<?> getAll();

    public ApiResponse<?> getById(Long id);

    public ApiResponse<?> save(Users user);

    public ApiResponse<?> delete(Long id);

    public ApiResponse<?> edit(Long id, Users user);

}
