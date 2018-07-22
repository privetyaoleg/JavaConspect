package com.eis.conspect.java.java8.stream.methods;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static toolkit.verification.CustomAssertions.assertThat;

public class StreamSimpleMethods {

    public List<String> stringList = Arrays.asList("first", "second", "hello", "world", "java", "abc");
    public List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

    /**
     *      Отфильтровывает записи, возвращает только записи, соответствующие условию
     */
    @Test
    public void testFilter() {
        List filterCollection = stringList.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
        assertThat(filterCollection).isEqualTo(Arrays.asList("first", "second", "hello", "world"));
    }

    /**
     *      Позволяет пропустить N первых элементов
     */
    @Test
    public void testSkip() {
        List skipFourFirstElementsList = intList.stream().skip(4).collect(Collectors.toList());
        assertThat(skipFourFirstElementsList).isEqualTo(Arrays.asList(123, 2, -12, 1, 0));
    }

    /**
     *      Возвращает стрим без дубликатов (для метода equals)
     */
    @Test
    public void testDistinct() {
        List onlyUniqueElements = intList.stream().distinct().collect(Collectors.toList());
        assertThat(onlyUniqueElements).isEqualTo(Arrays.asList(1, -23, 0, 523, 123, 2, -12));
    }

    /**
     *      Преобразует каждый элемент стрима
     */
    @Test
    public void testMap() {
        List eachElementPlusTen = intList.stream().map(x -> x + 10).collect(Collectors.toList());
        assertThat(eachElementPlusTen).isEqualTo(Arrays.asList(11, -13, 10, 533, 133, 12, -2, 11, 10));
    }


}
