package com.testing.training;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseGouping {

    @Test(groups = "Regression")
    void testCaseOne(){
        System.out.println("I'm in the testCaseOne - And in Regression Group");

    }

    @Test(groups = "Regression")
    void testCaseTwo(){
        System.out.println("I'm in the testCaseTwo - And in Regression Group");
    }
    @Test(groups = "Smoke Test")
    void testCaseThree(){
        System.out.println("I'm in the testCaseThree - And in Regression Group");

    }

    @Test(groups = {"Regression", "Sanity"})
    void testCaseFour(){

        System.out.println("I'm in the testCaseFour - And in Regression & Sanity Group");
    }
}
