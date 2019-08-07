package Dzien1;

import hashset.StringHashSet;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Application {
    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//        experimentWithArrayList(1_000_000);
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);
//
//        start = System.currentTimeMillis();
//        experimentWithArrayList(1_000_000);
//        end = System.currentTimeMillis();
//        System.out.println(end-start);
        Set<String> set = new StringHashSet();
        set.add("Ala");
        set.add("Alan");
        set.add("Jakub");
        set.add("Marek");
        set.add("Marek");

        set.removeIf(s -> s.startsWith("A"));

        System.out.println(set);
    }

    private static void experimentWithArrayList(int size) {
        List<Integer> numbers = IntStream.range(0, size)
                .boxed()
                .collect(toList());

        for (int i = size / 2; i < 1.5 * size; i++) {
            boolean contains = numbers.contains(i);
        }

    }

    private static void experimentWithHashSet(int size) {
        Set<Integer> numbers = IntStream.range(0, size)
                .boxed()
                .collect(toSet());

        for (int i = size / 2; i < 1.5 * size; i++) {
            boolean contains = numbers.contains(i);
        }
    }
}
