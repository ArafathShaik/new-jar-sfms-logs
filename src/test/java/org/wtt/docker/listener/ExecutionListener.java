// 
// Decompiled by Procyon v0.5.36
// 

package org.wtt.docker.listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import java.time.LocalDateTime;
import org.testng.ITestListener;

public class ExecutionListener implements ITestListener
{
    private TestStatus testStatus;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long sTime;
    private Long eTime;
    private String result;
    
    public ExecutionListener() {
        this.testStatus = new TestStatus();
    }
    
    @Override
    public void onTestStart(final ITestResult iTestResult) {
        this.testStatus = new TestStatus();
    }
    
    @Override
    public void onTestSuccess(final ITestResult iTestResult) {
        this.sendStatus(iTestResult, "PASS");
        this.result = "PASSED";
    }
    
    @Override
    public void onTestFailure(final ITestResult iTestResult) {
        this.sendStatus(iTestResult, "FAIL");
    }
    
    @Override
    public void onTestSkipped(final ITestResult iTestResult) {
        this.sendStatus(iTestResult, "SKIPPED");
        this.result = "SKIPPED";
    }
    
    @Override
    public void onTestFailedButWithinSuccessPercentage(final ITestResult iTestResult) {
    }
    
    @Override
    public void onStart(final ITestContext iTestContext) {
        this.sTime = System.currentTimeMillis();
    }
    
    @Override
    public void onFinish(final ITestContext iTestContext) {
    }
    
    public void onTestFailure1(final ITestResult Result) {
        System.out.println("The name of the testcase failed is :" + Result.getThrowable().getMessage());
        this.result = Result.getThrowable().getMessage();
        this.testStatus.setResult(this.result);
    }
    
    private void sendStatus(final ITestResult iTestResult, final String status) {
        this.eTime = System.currentTimeMillis();
        this.testStatus.setTestClass(iTestResult.getTestClass().getName());
        this.testStatus.setDescription(iTestResult.getMethod().getDescription());
        this.testStatus.setTestName(iTestResult.getMethod().getMethodName());
        this.testStatus.setStatus(status);
        this.testStatus.setExecutionDate(LocalDateTime.now().toString());
        this.testStatus.setEndTime(this.eTime + "");
        this.testStatus.setStartTime(this.sTime + "");
        if (status.equalsIgnoreCase("PASS")) {
            this.testStatus.setResult("PASS");
            this.testStatus.setStatus("COMPLETE");
        }
        else if (status.equalsIgnoreCase("SKIPPED")) {
            this.testStatus.setResult("SKIPPED");
            this.testStatus.setStatus("COMPLETE");
        }
        else if (status.equalsIgnoreCase("FAIL")) {
            this.testStatus.setResult(iTestResult.getThrowable().getLocalizedMessage());
        }
        final long el = this.eTime - this.sTime;
        this.testStatus.setDuration(el + "");
        this.testStatus.setTestPlanId(PropertiesUtility.properties.getProperty("test.planId"));
        this.testStatus.setTestPlanName(PropertiesUtility.properties.getProperty("test.planName"));
        ResultSender.send(this.testStatus);
    }
}
