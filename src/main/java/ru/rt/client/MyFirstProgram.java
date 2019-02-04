package ru.rt.client;

public class MyFirstProgram {

    private static String area;

    public static void main (String[] args) {
        System.out.print("Hello,world!\n\n");
        System.out.println("My name is Lena");
        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 - 2);
        System.out.println(2 / 2);
        System.out.println(1.0 / 2);
        System.out.println((2 + 2) * 2);
        System.out.println(("2" + "2"));
        System.out.println("2" + 2);
        System.out.println("2+2=" + (2 + 2));


        Square s = new Square(2);
        System.out.println("s area = " + s.area());

        Rectangle r=new Rectangle(5,6);
        System.out.println("r area = "+ r.area());

        Triangle t=new Triangle(6, 7);
        System.out.println("t area = " + t.area());

        Rhombus rh=new Rhombus(4,5);
        System.out.println("rh area = " + rh.area());

        Trapezium tr=new Trapezium(7, 8,3);
        System.out.println("tr area = "+ tr.area());


    }
}
