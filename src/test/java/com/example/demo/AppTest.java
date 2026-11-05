package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testGreeting() {
        App app = new App();
        assertEquals("Hello, Cloud DevOps Pipeline V2 - Auto Redeployed!", app.getGreeting());
    }
}