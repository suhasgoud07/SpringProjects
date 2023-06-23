package com.login.dip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.dip.bean.contactUs;

@Repository
public interface contactrepo extends  JpaRepository<contactUs,Integer>{

}
