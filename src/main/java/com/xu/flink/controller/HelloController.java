package com.xu.flink.controller;

import com.alibaba.fastjson.JSONObject;
import com.xu.flink.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yaohui
 */

@RestController
public class HelloController {

    @Resource
    private MongoTemplate mongoTemplate;

    @RequestMapping("/test")
    public String test(){
        List<User> userList= mongoTemplate.findAll(User.class);
        return JSONObject.toJSONString(userList);
    }
}
