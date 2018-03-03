package com.kobin.springbootbeanvalidation.web;

import com.kobin.springbootbeanvalidation.entity.CheckInterface.UserCheckSequence;
import com.kobin.springbootbeanvalidation.entity.User;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by @author shibinbin on 2018/3/3.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Object login(@Validated({UserCheckSequence.class}) User user){
        return "succ";
    }
}
