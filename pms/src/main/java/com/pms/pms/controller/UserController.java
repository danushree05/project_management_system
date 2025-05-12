package com.pms.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pms.pms.model.User;
import com.pms.pms.service.UserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class UserController {
    @Autowired
    UserService userService;

   @PostMapping("/post")
   public User addUser(@RequestBody User user) {

       return userService.addUsers(user);  
   }
   @GetMapping("/get")
   public List<User> getUser()
   {
    return userService.getUsers();
   }
   @PutMapping("/put/{userid}")
   public User editUser(@PathVariable Long userid,@RequestBody User user)
   {
    return userService.editUsers(userid,user);
   }
   @DeleteMapping("/del/{userid}")
   public void delUser(@PathVariable Long userid)
   {
    userService.delUsers(userid);
   }
   
    
}
