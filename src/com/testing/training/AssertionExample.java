package com.testing.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

    @Test
    void testOne(){
        System.out.println("Hi, i am Test one ...");
        Assert.assertEquals("FaceBook", "FaceBook");
    }
    @Test
    void testTwo(){
        System.out.println("Hi, i am Test two ...");
        Assert.assertEquals(404 ,200);
    }
    @Test
    void testThree(){
        System.out.println("Hi, i am Test three ...");
        Assert.assertTrue(true);

    }
    @Test
    void testFour(){
        System.out.println("Hi, i am Test four ...");
        Assert.assertTrue(false, "Making Test Failure");
    }

    @Test
    void testFive(){
        System.out.println("Hi, i am Test five ...");

    }

    @Test
    void testSix(){
        System.out.println("Hi, i am Test six ...");
    }
}
