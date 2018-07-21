package com.eis.conspect.java.testing.testng.parameters.dataProvider;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static utils.properties.ReadProperties.readProperties;

public class DataProviders {

    private final String DATA_PROVIDER_PATH = "src/main/java/com/eis/conspect/java/testing/testng/parameters/dataProvider/users.properties";

    /**
     * Data provider must return Object[][]/Object[] or Iterator<Object[]>/Iterator<Object>
     */
    @DataProvider
    private Iterator<Object[]> usersFromFile() throws IOException {
        List<Object[]> data = new ArrayList<>();
        readProperties(DATA_PROVIDER_PATH).forEach((key, value) -> data.add(new Object[]{key, value}));
        return data.iterator();
    }

    @DataProvider
    private Iterator<Object[]> usersData() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"SuperuserLogin", "SuperuserPassword"});
        data.add(new Object[]{"pavel1993", "hello1252"});

        return data.iterator();
    }

    @DataProvider
    private Iterator<Object[]> usersRandomData() {
        List<Object[]> data = new ArrayList<>();
        IntStream.range(1, 10).forEach(x -> data.add(new Object[]{generateRandomLogin(), generateRandomPassword()}));
        return data.iterator();
    }

    private String generateRandomLogin() {
        return "user" + new Random().nextInt(10000);
    }

    private String generateRandomPassword() {
        return "password" + new Random().nextInt(10000);
    }
}