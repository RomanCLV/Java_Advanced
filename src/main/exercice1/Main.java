package main.exercice1;

public class Main {
    public static void main(String[] argv) {
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Square(2.0);
        shapes[1] = new Circle(3.0);
        shapes[2] = new Square(5.2);
        for (Shapes shape : shapes) {
            System.out.println("Surface of " + shape + " is: " + round(shape.getSurface(), 2) + " cm²");
        }
    }

    private static double round(double value, int precision) {
        if (precision < 0) {
            throw new IllegalArgumentException("precision need to be positive!");
        }
        double rounder = Math.pow(10, precision);
        return Math.round(value * rounder) / rounder;
    }
}
