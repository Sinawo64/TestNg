package com.testing.training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {
    @Test
    void testOne(){
        System.out.println("Hi, i am Test one ...");
    }
    @Test
    void testTwo(){
        System.out.println("Hi, i am Test two ...");
    }
    @Test
    void testThree(){
        System.out.println("Hi, i am Test three ...");
//Throw exception
       // throw new SkipException("Skipping Delibretly, As this is incomplete");
    }
    @Test
    void testFour(){
        System.out.println("Hi, i am Test four ...");
    }
}
