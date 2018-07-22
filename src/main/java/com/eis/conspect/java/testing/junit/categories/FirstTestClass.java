package com.eis.conspect.java.testing.junit.categories;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
/*
     JVM - every run will be random
     NAME_ASCENDING - alphanumeric order
     DEFAULT - consistent order (random)
 */
public class FirstTestClass {

    @Test
    @Category({MyCategories.PositiveTests.class, MyCategories.BrokenTests.class})
    public void firstTest1() {
        System.out.println("First test 1");
        System.out.println("------------------------");
    }

    @Test
    @Category({MyCategories.RegressionTests.class})
    public void secondTest1() {
        System.out.println("Second test 1");
        System.out.println("------------------------");
    }

    @Test
    @Category({MyCategories.PositiveTests.class, MyCategories.SmokeTests.class})
    public void thirdTest1() {
        System.out.println("Third test 1");
        System.out.println("------------------------");
    }
}