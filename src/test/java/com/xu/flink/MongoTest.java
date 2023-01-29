package com.xu.flink;

import com.xu.flink.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class MongoTest {

    @Resource
    private MongoTemplate mongoTemplate;

    @Test
    void insert(){

        User user= new User();
        user.setName("test");
        user.setAge(18);
        mongoTemplate.insert(user);
    }
}
