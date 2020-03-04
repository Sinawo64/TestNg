package com.testing.training;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    @Test
    void testCaseOne(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("*** test case one started ***");
        softAssert.assertEquals(5,5, "First hard assert failed");
        System.out.println("hard assert success ...");
        softAssert.assertTrue("hello".equals("hello"), "Second hard assert failed");
        System.out.println("*** test case one executed successfully ***");

    }

    @Test
    void testCaseTwo(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("*** test case two started ***");
        softAssert.assertEquals(5,5, "First hard assert failed");
        System.out.println("hard assert success ...");
        softAssert.assertTrue(false,  "Second hard assert failed");
        softAssert.assertTrue(false, "Third hard assert failed");
        System.out.println("*** test case two executed successfully ***");
        softAssert.assertAll();
    }
    @Test
    void testCaseThree(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("*** test case Three started ***");
        softAssert.assertEquals(5,5, "First hard assert failed");
        System.out.println("hard assert success ...");
        softAssert.assertTrue("Hello".equals("Hello"), "Second hard assert failed");
        System.out.println("*** test case Three executed successfully ***");

    }
}
