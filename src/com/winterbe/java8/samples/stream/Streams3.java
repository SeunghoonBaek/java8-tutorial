package com.winterbe.java8.samples.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Benjamin Winterberg
 */
public class Streams3 {

    public static List<String> generateUUIDList(){

        final int MAX = 1_000_000;
        List<String> values = new ArrayList<>(MAX);
        for (int i = 0; i < MAX; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        return values;
    }

    public static void sortSequential(List<String> values) {
        long t0 = System.nanoTime();

        long count = values
                        .stream()
                        .sorted()
                        .count();

        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    public static void sortParallel(List<String> values) {
        long t0 = System.nanoTime();

        long count = values
                        .parallelStream()
                        .sorted()
                        .count();

        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }

    public static void main(String[] args) {
        List<String> values = generateUUIDList();

        sortSequential(values);
        sortParallel(values);
    }
}
