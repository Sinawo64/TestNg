package com.testng.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestClass {

    void testOne(){
        System.out.println("I am TestOne");
    }
    @Test(dataProvider = "dataprovider")
    void testGetData(String s){
        System.out.println("Test GetData methos, input =" +s);
    }

    @DataProvider
    public Object[] dataprovider(){
        return new Object[]{"A","B"};
    }

    @Test
    void testThree(){
        Assert.assertEquals(5, 5);
    }

    @Test
    void testFour(){
        System.out.println("I am testFour");
        throw new SkipException(null);
    }
}
