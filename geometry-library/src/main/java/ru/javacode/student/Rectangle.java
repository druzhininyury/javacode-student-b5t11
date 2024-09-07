package ru.javacode.student;

public class Rectangle implements GeometryFigure {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int getColor() {
        return 0xFF0000;
    }

}
