package main.exercice5;

public class Main {

    public static void main(String[] argv) {
        MyIterable<Integer> myIterable = new MyIterable<>();
        myIterable.add(0);
        myIterable.add(1);
        myIterable.add(2);
        myIterable.add(3);
        myIterable.add(4);
        for (int n : myIterable) {
            System.out.println(n);
        }

        System.out.println("\n");
        myIterable.insert(0, 10);
        myIterable.set(5, 9);
        for (int n : myIterable) {
            System.out.println(n);
        }
    }
}
