/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.entity.User;
import com.mycompany.mapper.UserMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Suman
 */
@Controller
public class DefaultController {
    
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        
        List<User> users = userMapper.getAllUsers();
        System.out.println(users.toString());
        map.put("users", users);
        return "index";
    }

//    @RequestMapping(value = "/getall", method = RequestMethod.GET)
//    public @ResponseBody Map<String, String> index() {
//        Map<String, String> hm = new HashMap<>();
//        hm.put("key1", "value1");
//        System.out.println("=====================================");
//        return hm;
//    }
}
