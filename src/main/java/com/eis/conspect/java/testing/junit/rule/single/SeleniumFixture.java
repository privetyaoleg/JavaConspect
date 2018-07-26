package com.eis.conspect.java.testing.junit.rule.single;

import org.junit.Rule;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

public class SeleniumFixture {

    WebDriverRule driver = new WebDriverRule();

    @Rule
    public TestRule rule = RuleChain.outerRule(driver).around(new ScreenshotRule(driver));
}