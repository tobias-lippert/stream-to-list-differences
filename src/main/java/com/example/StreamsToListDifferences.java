package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsToListDifferences {
    public static void main(String[] args) {

        Pigeon bird = new Pigeon();
        List<Pigeon> streamToList = Stream.of(bird).toList();
        List<Animal> collectToList = Stream.of(bird).collect(Collectors.toList());
        List<Animal> collectToUnmodifiableList = Stream.of(bird).collect(Collectors.toUnmodifiableList());

        System.out.println("Class of streamToList: " + streamToList.getClass());
        System.out.println("Class of collectToList: " + collectToList.getClass());
        System.out.println("Class of collectToUnmodifiableList: " + collectToUnmodifiableList.getClass());

        String result = Stream.of("a", "b", "c").collect(MySuperCoolCollector.combineStrings());
        System.out.println(result);

    }
}
