package org.sergiogarguir.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream enteros1 = IntStream.range(5, 20).peek(System.out::println);
        IntStream enteros2 = IntStream.rangeClosed(5, 20).peek(System.out::println);

        //Integer resultado = enteros.reduce(0, (a,b) -> a + b);
        //Integer resultado = enteros.sum();
        //System.out.println(resultado.toString());

        System.out.println("========================== range ==============================");
        IntSummaryStatistics stats1 = enteros1.summaryStatistics();
        System.out.println("getMax = " + stats1.getMax());
        System.out.println("getMin = " + stats1.getMin());
        System.out.println("getSum = " + stats1.getSum());
        System.out.println("getAverage = " + stats1.getAverage());
        System.out.println("getCount = " + stats1.getCount());

        System.out.println("========================== rangeClosed ==============================");
        IntSummaryStatistics stats2 = enteros2.summaryStatistics();
        System.out.println("getMax = " + stats2.getMax());
        System.out.println("getMin = " + stats2.getMin());
        System.out.println("getSum = " + stats2.getSum());
        System.out.println("getAverage = " + stats2.getAverage());
        System.out.println("getCount = " + stats2.getCount());
    }
}
