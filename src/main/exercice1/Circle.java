package main.exercice1;

public class Circle extends Shapes {

    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
