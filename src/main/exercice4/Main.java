package main.exercice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] argv) {
        List<Integer> data = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(get(data, 2, 2, 3));
    }

    private static int get(List<Integer> data, int i, int j, int matrixSize) {
        return data.get((i * matrixSize) + j);
    }
}
