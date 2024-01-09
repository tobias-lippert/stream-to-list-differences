package com.example;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NullValuesBehaviorTest {

    @Test
    void testNullValuesBehaviorCollectorsToList() {
        assertDoesNotThrow(() -> Stream.of("abc", null).collect(Collectors.toList()));
    }

    @Test
    void testNullValuesBehaviorCollectorsToUnmodifiableList() {
        assertThrows(NullPointerException.class,() -> Stream.of("abc", null).collect(Collectors.toUnmodifiableList()));
    }
    @Test
    void testNullValuesBehaviorCollectorsToCollection() {
        assertDoesNotThrow(() -> Stream.of("abc", null).toList());
    }


}
