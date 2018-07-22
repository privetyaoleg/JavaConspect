package com.eis.conspect.java.java8.stream.creation;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationStream {

    @Test
    public void testCreateStream() throws IOException {
        // 1. Классический: Создание стрима из коллекции - collection.stream()
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();

        // 2. Создание стрима из значений - Stream.of(значение1,… значениеN)
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");

        // 3. Создание стрима из массива - Arrays.stream(массив)
        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        // 4. Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме) - Files.lines(путь_к_файлу)
        Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));

        // 5. Создание стрима из строки - «строка».chars()
        IntStream streamFromString = "123".chars();

        // 6. С помощью Stream.builder - Stream.builder().add(...)....build()
        Stream.builder().add("a1").add("a2").add("a3").build();

        // 7. Создание параллельного стрима - collection.parallelStream()
        Stream<String> stream = collection.parallelStream();

        // 8. Создание бесконечных стрима с помощью Stream.iterate - Stream.iterate(начальное_условие, выражение_генерации)
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1); // 1, 2, 3, 4,… N.

        // 9. Создание бесконечных стрима с помощью Stream.generate - Stream.generate(выражение_генерации)
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
    }
}