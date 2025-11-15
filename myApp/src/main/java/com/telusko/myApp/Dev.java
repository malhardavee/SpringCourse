package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("desktop")
    private Computer comp;

//    public Dev(Laptop laptop) { ///  CONSTRUCTOR INJECTION
//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("Working on awesome project");
    }
}
