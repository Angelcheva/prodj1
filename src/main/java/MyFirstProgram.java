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
      Square square= new Square(2, 3);
      square.a=2;
      square.b=3;
      Integer integer= setName(square.a, square.b);
      System.out.println("sun="+ integer);
  }
  private static Integer setName(int a, int b){
      return a+b;
  }
}