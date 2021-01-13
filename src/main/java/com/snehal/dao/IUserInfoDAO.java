package com.snehal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.snehal.entity.UserInfo;

@Repository
public interface IUserInfoDAO extends CrudRepository<UserInfo, Long> {
 
    @Query("SELECT u FROM UserInfo u WHERE u.userName = :userName")
    public UserInfo getUserByUsername(@Param("userName") String userName);
}