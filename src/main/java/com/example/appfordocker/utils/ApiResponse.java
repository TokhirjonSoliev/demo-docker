package com.example.appfordocker.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {

    public int statusCode;

    public T data;


    public ApiResponse(int statusCode) {
        this.statusCode = statusCode;
    }
}
