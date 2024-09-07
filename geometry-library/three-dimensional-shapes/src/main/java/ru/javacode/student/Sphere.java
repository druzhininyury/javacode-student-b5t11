package ru.javacode.student;

public class Sphere implements GeometrySolid {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
