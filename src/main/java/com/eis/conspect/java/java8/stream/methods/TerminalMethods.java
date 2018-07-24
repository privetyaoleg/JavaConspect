package com.eis.conspect.java.java8.stream.methods;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminalMethods {

    /**
     * Возвращает первый элемент из стрима (возвращает Optional)
     */
    @Test
    public void testFindFirst() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523);
        Integer x = intList.stream().findFirst().orElse(50);
        assertThat(x).isEqualTo(1);
    }

    /**
     * Возвращает первый элемент из стрима (возвращает Optional)
     * В большинстве случаев (всегда?) возвращает первый элемент
     */
    @Test
    public void testFindAny() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        Integer x = intList.stream().filter(z -> z > 0).findAny().get();
        assertThat(x).isIn(1, 523, 100, 23, 3);
    }
}
