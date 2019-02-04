package ru.rt.client;

public class Trapezium {
    public double area;
    double a = 7;
    double b = 8;
    double h = 3;

    public Trapezium(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double area() {
        return 0.5 * (this.a + this.b) * this.h;
    }
}
