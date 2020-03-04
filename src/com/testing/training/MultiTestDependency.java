package com.testing.training;


import org.testng.annotations.Test;

public class MultiTestDependency {

    @Test
    void start(){
        System.out.println("Starting the server");
    }
    @Test(dependsOnMethods = "start")
    void init(){
        System.out.println("Initializing the data for processing!");

    }
    @Test(dependsOnMethods = "init")
    void process(){
        System.out.println("Processing the data!");


    }
    @Test(dependsOnMethods = "process")
    void stop(){
        System.out.println("stopping server");

    }

}
