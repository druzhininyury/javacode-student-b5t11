package ru.javacode.student;

public class Cube implements GeometrySolid {

    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}
