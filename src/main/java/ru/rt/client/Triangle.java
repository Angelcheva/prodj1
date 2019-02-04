package ru.rt.client;

public class Triangle {
    public  double area;
       double a=6;
       double h=7;
  public Triangle(double a, double h){
      this.a=a;
      this.h=h;
    }
    public double area() {
      return  0.5*this.a*this.h;
    }
}

