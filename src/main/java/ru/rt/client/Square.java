package ru.rt.client;

public class Square {
    public double area;
    double a = 2;

    public Square(double a) {
        this.a = a;
    }

    public double area() {

        return this.a*this.a;
    }
}

