package com.pms.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.pms.model.User;

@Repository

public interface UserRepo extends JpaRepository<User,Long>{
    
}





