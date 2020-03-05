package com.testng.dataprovider;

import org.testng.annotations.Test;

public class DataProviderParameterExample {
    @Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
    void scenario1(String scenarioData){
        System.out.println("Scenario testing:Data("+ scenarioData +")");
    }

    @Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
    void scenario2(String scenarioData){
        System.out.println("Scenario testing: Data("+scenarioData + ")");
    }


    @Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
    void commonScenarios(String scenarioData){
        System.out.println("Common Scenario testing: Data(" + scenarioData +")");
    }
}
