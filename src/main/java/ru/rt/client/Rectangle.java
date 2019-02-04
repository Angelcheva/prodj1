package ru.rt.client;

public class Rectangle {
    public double area;
    double a=5;
    double b=6;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
        }

    public Rectangle() {

    }

    public double area(){
        return this.a+this.b;
    }
}
