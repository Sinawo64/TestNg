package com.testing.training;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test
    void testOne(){
        System.out.println("Hi, i am Test one ...");
    }
    @Test (priority = 1)
    void testTwo(){
        System.out.println("Hi, i am Test two ...");
    }
    @Test (priority = 2)
    void testThree(){
        System.out.println("Hi, i am Test three ...");

    }
    @Test (priority = 3)
    void testFour(){
        System.out.println("Hi, i am Test four ...");
    }
}
