package com.eis.conspect.java.java8.optional;

import java.util.Optional;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, String> getSecondWord = (String s) -> {
            return s.split(" ").length > 1 ? s.split(" ")[1] : null;
        };

        Function<String, Integer> getLetterCount = t -> t.length();

        getSecondWord.andThen(getLetterCount).apply("Hello world");

        Optional<String> op = Optional.ofNullable(getSecondWord.apply("Hell"));
        op.ifPresent(System.out::println);
        System.out.println(op.orElse("new value"));

        Optional.ofNullable(getSecondWord.apply("Hello bybe")).map(getLetterCount).ifPresent(System.out::println);
    }
}
