package org.example.prototypepattern;

public class Circle implements Cloneable {
    private double latitude;
    private double longitude;
    private double radius;

    public Circle(double latitude, double longitude, double radius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed for Circle", e);
        }
    }
}

