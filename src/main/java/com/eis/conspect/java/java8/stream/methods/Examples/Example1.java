package com.eis.conspect.java.java8.stream.methods.Examples;

import com.eis.conspect.java.java8.stream.methods.TestModels.Person;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Example1 {

    private List<Person> persons = getPersonsList();

    @Test
    public void peopleFromUSA() {
        persons.stream().filter(person -> person.getCountry().equals("US"))
                .forEach(System.out::println);
    }

    @Test
    public void averageAgeFromMexico() {
        double averageAge = persons.stream()
                .filter(person -> person.getCountry().equals("Mexico"))
                .mapToInt(Person::getAge)
                .summaryStatistics()
                .getAverage();
        double result = new BigDecimal(averageAge).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("Average age people's from Mexico = " + result);
    }


    private List<Person> getPersonsList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(23, "US", "John"));
        persons.add(new Person(33, "Mexico", "Elizabet"));
        persons.add(new Person(18, "Mexico", "Cristiano"));
        persons.add(new Person(19, "US", "Alex"));
        persons.add(new Person(23, "Canada", "Carl"));
        persons.add(new Person(13, "Mexico", "Ann"));
        persons.add(new Person(17, "Brazil", "Huan"));
        persons.add(new Person(18, "US", "Aleh"));
        return persons;
    }
}