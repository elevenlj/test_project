package com.eleven.test_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijun
 * @Date: 2020/5/5
 * @Description:TODO
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("method1")
    public String method1(){
        return "method1";
    }
    @RequestMapping("method2")
    public String method2(){
        return "method2";
    }
}
