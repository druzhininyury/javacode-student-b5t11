package ru.javacode.student;

public class Circle implements GeometryFigure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int getColor() {
        return 0x00FF00;
    }

}
