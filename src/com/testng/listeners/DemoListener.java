package com.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started :" + result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Successful :" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test got Failed:" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test got Skipped :" + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
