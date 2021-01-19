package main.exercice1;


public class Square extends Shapes {

    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
