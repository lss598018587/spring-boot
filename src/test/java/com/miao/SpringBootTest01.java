package com.miao;


import com.miao.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTest01 {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext context;

    @Test
    public void testHelloService(){
        boolean b = context.containsBean("hi");
        System.out.println(b);
    }

    @Test
    public void contextLoads(){
        System.out.println(person);
    }

}
