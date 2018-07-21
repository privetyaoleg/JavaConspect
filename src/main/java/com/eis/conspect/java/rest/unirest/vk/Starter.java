package com.eis.conspect.java.rest.unirest.vk;

import com.eis.conspect.java.rest.unirest.vk.model.User;
import org.testng.annotations.Test;

import java.util.List;

import static com.eis.conspect.java.rest.unirest.vk.Mapper.getUserGet;
import static com.eis.conspect.java.rest.unirest.vk.Mapper.getUsersGet;

public class Starter {

    @Test
    public void test() throws Exception {
        User user = getUserGet("123124");
        System.out.println(user);
    }
}
