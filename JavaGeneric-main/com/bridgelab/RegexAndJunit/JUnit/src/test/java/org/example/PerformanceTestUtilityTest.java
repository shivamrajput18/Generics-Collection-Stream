package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class PerformanceTestUtilityTest {

    PerformanceTestUtility obj = new PerformanceTestUtility();

    @Test
    @Timeout(2) // Test fails if it takes longer than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        assertEquals("Task Completed", obj.longRunningTask());
    }
}
