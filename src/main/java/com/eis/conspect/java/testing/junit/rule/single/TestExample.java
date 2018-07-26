package com.eis.conspect.java.testing.junit.rule.single;

import org.junit.Test;

public class TestExample extends SeleniumFixture {

    @Test
    public void testExample() {
        driver.get("http://google.com");
        throw new RuntimeException();
    }
}