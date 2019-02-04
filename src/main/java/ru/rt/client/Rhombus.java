package ru.rt.client;

public class Rhombus {
    public double area;
    double a = 4;
    double h = 5;

    public Rhombus(double a, double h){
        this.a=a;
        this.h=h;
    }
    public double area(){
        return this.a*this.h;
    }
}
