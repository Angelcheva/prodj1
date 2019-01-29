public class MyFirstProgram {

  public static void main (String[] args) {
	System.out.print("Hello,world!\n\n");
	System.out.println("My name is Lena");
      System.out.println(2+2);
      System.out.println(2*2);
      System.out.println(2-2);
      System.out.println(2/2);
      System.out.println(1.0/2);
      System.out.println((2+2)*2);
      System.out.println(("2"+"2"));
      System.out.println("2"+2);
      System.out.println("2+2=" +(2+2));
      Square square= new Square(1, 1);
      System.out.println("square area = "+ square.area());

      square.a=2;
      square.b=3;
      System.out.println("square area = "+ square.area());
  }
}