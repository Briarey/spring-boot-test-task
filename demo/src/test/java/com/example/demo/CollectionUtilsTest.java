package com.example.demo;

import com.example.demo.service.util.CollectionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CollectionUtilsTest {

    private final CollectionUtils collectionUtils = new CollectionUtils();

    /*
    Implement a method that uses **Java Stream API** to find and return all duplicated
    elements in the given list
     */
    @Test
    public void findFirstRepeatedCharacterInStringTest() {

        List<Integer> elements = Arrays.asList(32, 15, 8, 28, 45, 8, 85, 32, 14);

        List<Integer> result = collectionUtils.findAllDuplications(elements);

        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(result.contains(32));
        Assertions.assertTrue(result.contains(8));

    }

    /*
    Implement a method that uses **Java Stream API** to find and return an element
    of the given list that starts with a provided value.
    If there is no such element - throw a RuntimeException
     */

    @Test
    public void findElementStartsWithAValueTest() {
        List<Integer> elements = Arrays.asList(32, 15, 8, 28, 45, 8, 85, 32, 14);
        Assertions.assertEquals(28, collectionUtils.findElementStartsWithAValue(elements, 2));

        Assertions.assertThrows(RuntimeException.class, () -> { collectionUtils.findElementStartsWithAValue(elements, 25); });
    }

}
