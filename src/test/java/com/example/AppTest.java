package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testGreet() {
        App app = new App();
        String result = app.greet("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }
}
