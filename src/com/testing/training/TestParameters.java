package com.testing.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @Parameters("browser")
    @Test
    void testCaseOne(String browser){
        System.out.println("browser passed as :-" + browser);

    }
    @Parameters({"userName", "password"})
    @Test
    void testCaseTwo(String userName, String password){
        System.out.println("Parameter for User Name passed as :- "+ userName);
        System.out.println("Parameter for Password  passed as :- "+ password);
    }
}
