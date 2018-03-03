package com.kobin.springbootbeanvalidation.Adaptor;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by @author shibinbin on 2018/3/3.
 */
@RestControllerAdvice
public class SysExceptionHandler {
    @ExceptionHandler (MethodArgumentNotValidException.class)
    public Map<String, Object> paramInvalid(MethodArgumentNotValidException e) {
        Map<String, Object> map = new HashMap <>();
        map.put("code", 400);
        map.put("msg", e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return map;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public Map<String, Object> requestInvalid() {
        Map<String, Object> map = new HashMap <>();
        map.put("code", 400);
        map.put("msg", "请求输入参数格式不正确");
        return map;
    }
}
