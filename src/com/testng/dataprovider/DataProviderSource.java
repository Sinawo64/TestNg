package com.testng.dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderSource {

    @DataProvider(name="scenarioData")
        public static Object[][] getScenarioData(ITestContext context){
        String testCase = context.getName();
            if("scenario1".equals(testCase)){
                return new Object[][]{{"Scenario1 data"}};
            }else if("scenario2".equals(testCase)){
                return new Object[][]{{"Scenario2 data"}};
            }else{
                return new Object[][]{{"Common scenario data"}};
            }
    }

    @DataProvider(name="TestType")
    public static Object[][] getTestTypeData(Method method){
        String testName = method.getName();
        if("IntegrationLevel".equals(testName)){
            return new Object[][]{{"Integration test data"}};
        }else if("AcceptanceLevel".equals(testName)){
            return new Object[][]{{"Acceptance test data"}};
        }else{
            return new Object[][]{{"Common test data"}};
        }
    }

}
