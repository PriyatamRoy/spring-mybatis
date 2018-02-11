/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapper;

import com.mycompany.entity.User;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
/**
 *
 * @author Suman
 */
public interface UserMapper {

    @Select("select id, firstname, lastname from alumni")
    @Results(value={
            @Result(column="id", property="id"),
            @Result(column="firstname", property="firstName"),
            @Result(column="lastname", property="lastName")
    })
    List<User> getAllUsers();

}
