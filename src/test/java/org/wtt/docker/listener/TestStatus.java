// 
// Decompiled by Procyon v0.5.36
// 

package org.wtt.docker.listener;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestStatus
{
    @JsonProperty("testClass")
    private String testClass;
    @JsonProperty("description")
    private String description;
    @JsonProperty("status")
    private String status;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("endTime")
    private String endTime;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("executionTime")
    private String executionTime;
    @JsonProperty("testName")
    private String testName;
    @JsonProperty("result")
    private String result;
    @JsonProperty("testPlanId")
    private String testPlanId;
    @JsonProperty("testPlanName")
    private String testPlanName;
    
    public void setTestPlanId(final String testPlanId) {
        this.testPlanId = testPlanId;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setExecutionDate(final String executionTime) {
        this.executionTime = executionTime;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public void setTestClass(final String testClass) {
        this.testClass = testClass;
    }
    
    public void setStartTime(final String startTime) {
        this.startTime = startTime;
    }
    
    public void setEndTime(final String endTime) {
        this.endTime = endTime;
    }
    
    public String getDuration() {
        return this.duration;
    }
    
    public void setDuration(final String duration) {
        this.duration = duration;
    }
    
    public void setTestName(final String testName) {
        this.testName = testName;
    }
    
    public void setResult(final String result) {
        this.result = result;
    }
    
    public String getExecutionTime() {
        return this.executionTime;
    }
    
    public void setExecutionTime(final String executionTime) {
        this.executionTime = executionTime;
    }
    
    public String getTestClass() {
        return this.testClass;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public String getStartTime() {
        return this.startTime;
    }
    
    public String getEndTime() {
        return this.endTime;
    }
    
    public String getTestName() {
        return this.testName;
    }
    
    public String getResult() {
        return this.result;
    }
    
    public String getTestPlanId() {
        return this.testPlanId;
    }
    
    public String getTestPlanName() {
        return this.testPlanName;
    }
    
    public void setTestPlanName(final String testPlanName) {
        this.testPlanName = testPlanName;
    }
}
