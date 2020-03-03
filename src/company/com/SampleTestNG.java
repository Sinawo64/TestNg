package company.com;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTestNG {



    @BeforeSuite
    public void beforeSuiteMethod() {

        System.out.println("Executing before test suite");

    }
    @Test
    void test_Login(){
        System.out.println("This is login Test");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("Executing after test suite");

    }
}
