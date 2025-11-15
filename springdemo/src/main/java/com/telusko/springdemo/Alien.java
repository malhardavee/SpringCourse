package com.telusko.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age = 18;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void code() {
        System.out.println("Im Coding");
    }
}
