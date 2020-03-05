package com.testng.dataprovider;

import org.testng.annotations.Test;

public class DataProviderAcceptanceExample {

    @Test(dataProvider = "TestType", dataProviderClass = DataProviderSource.class)
    void acceptanceTest(String data){
        System.out.println("Acceptance testing: Data(" + data+")");
    }
}
