package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void compatibilityTest() {
        App app = new App();
        // Since the workflow tests on Java 11, 17, and 21,
        // this generic unit test will run and pass uniformly on all three.
        assertTrue("Application should be supported", app.isSupported());
    }
}