package com.pms.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.pms.model.User;
import com.pms.pms.repository.UserRepo;

@Service
public class UserService {
    @Autowired 
    UserRepo userRepo;
    User useravail;
    @SuppressWarnings("null")
    public User addUsers(User user)
    {
        return userRepo.save(user);
    }
    public List<User> getUsers()
    {
        return userRepo.findAll();
    }
    @SuppressWarnings("null")
    public User editUsers(Long userid,User user)
    {
       useravail=userRepo.findById(userid).orElse(null);
       if(userid!=null)
       {
        useravail.setUserId(user.getUserId());
        useravail.setUserEmail(user.getUserEmail());
        useravail.setPassword(user.getPassword());
        return userRepo.saveAndFlush(useravail);
       }
       else
       return null;
    }
    @SuppressWarnings("null")
    public void delUsers(Long userid)
    {
        userRepo.deleteById(userid);
    }
}
