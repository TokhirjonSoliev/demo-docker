package com.example.appfordocker.controller;

import com.example.appfordocker.service.UserService;
import com.example.appfordocker.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService ;

    @GetMapping("getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getById(id));
    }

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody Users user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.ok(userService.delete(id));
    }

    @PutMapping("edit/{id}")
    public ResponseEntity<?> edit(@PathVariable Long id, @RequestBody Users user) {
        return ResponseEntity.ok(userService.edit(id, user));
    }


}
