package executionorder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class sampleTestngUsage {
    @BeforeTest
    void beforeTest(){
        System.out.println("From beforeTest annotation in SampleTestingUsage class...");
    }
    @BeforeSuite
    void beforeSuite(){
        System.out.println("From beforeSuite annotation in SampleTestingUsage class...");
    }
}
