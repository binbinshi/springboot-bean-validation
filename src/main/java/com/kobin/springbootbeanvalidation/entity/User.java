package com.kobin.springbootbeanvalidation.entity;


import com.kobin.springbootbeanvalidation.entity.CheckInterface.PasswordCheck;
import com.kobin.springbootbeanvalidation.entity.CheckInterface.UserNameCheck;

import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotEmpty;
import javax.validation.groups.Default;

import lombok.Data;

/**
 * Created by @author shibinbin on 2018/3/3.
 * 此处若写的有GroupSequence则代表重写了Default的验证方法，验证顺序按照顺序进行
 */
@Data
public class User{

    @NotEmpty(message = "userName不能为空", groups = {UserNameCheck.class})
    private String userName;

    @NotEmpty(message = "password不能为空", groups = {PasswordCheck.class})
    private String password;
}
