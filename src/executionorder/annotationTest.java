package executionorder;

import org.testng.annotations.*;

public class annotationTest {

    @Test
    void first(){
        System.out.println("From first test annoted in annotationTest...");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("From beforeMethod test annoted in annotationTest...");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("From afterMethod test annoted in annotationTest...");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("From beforeClass test annoted in annotationTest...");
    }
    @AfterClass
    void afterClass(){
        System.out.println("From afterClass test annoted in annotationTest...");
    }
    @AfterTest
    void afterTest(){
        System.out.println("From afterTest test annoted in annotationTest...");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("From afterSuite test annoted in annotationTest...");
    }

}
