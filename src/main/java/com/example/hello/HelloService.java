package com.example.hello;

import org.springframework.stereotype.Service;

/**
 * @author ChengJianSheng
 * @date 2019-05-26
 */
@Service
public class HelloService {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 家乡
     */
    private String hometown;

    public HelloService(String name, Integer age, String hometown) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public String sayHello(String name) {
        return "Hello, " + name;
    }

    public String helloWorld() {
        return String.format("[name=%s, age=%d, hometown=%s]", this.name, this.age, this.hometown);
    }

}
