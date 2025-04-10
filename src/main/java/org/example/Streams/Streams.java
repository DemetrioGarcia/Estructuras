package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(1,2,3,4,5);
        List<Integer> numeritos = new ArrayList<>(Arrays.asList(1,2,4,6,31,34,123));

        numeritos.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .forEach(System.out::println);

        numeritos.forEach(System.out::println);

        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche","Mutxamel","Sant Vicent", "Eliana"));

        pueblos.stream()
                .map(String::toUpperCase)
                .filter(pueblo -> pueblo.contains("I"))
                .filter(pueblo -> pueblo.endsWith("A"))
                .forEach(System.out::println);

        pueblos.stream()
                .sorted()
                .forEach(System.out::println);
        
    }
}
