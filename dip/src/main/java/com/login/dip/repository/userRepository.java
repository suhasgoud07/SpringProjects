package com.login.dip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.dip.bean.User;

@Repository
public interface userRepository extends JpaRepository<User,Integer>{


}
