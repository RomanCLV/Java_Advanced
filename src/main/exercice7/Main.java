package main.exercice7;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] argv) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(53);
        list.add(56);
        list.add(1);
        list.add(527);
        list.add(-5);
        list.add(145);
        list.add(24);
        list.add(56);
        list.add(53);

        Runnable print = () -> {
            for (int n : list) {
                System.out.println(n);
            }
        };

        System.out.println("\nBefore sort :\n");
        print.run();

        System.out.println("\nAfter sort :\n");
        list.sort((a, b) -> {
            if (a < b) return -1;
            else if (a > b) return 1;
            else return 0;
        });
        print.run();
    }

    private static void lesson() {

        BiFunction<Integer, Integer, Long> sum = (val1, val2) -> (long) val1 + val2;

        Consumer<String> display = (String param) -> System.out.println(param);

        Runnable myTreatment = () -> {
            System.out.println("traitement 1");
            System.out.println("traitement 2");
        };
    }
}
