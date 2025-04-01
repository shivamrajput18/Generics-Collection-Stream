package org.example;

public class PerformanceTestUtility {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Simulate a 3-second delay
        return "Task Completed";
    }
}
