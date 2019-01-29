public class Square {
    int a = 2;
    int b = 3;

    public Square(int a, int b) {
        showSides();
        this.a = a;
        this.b = b;
    }
    public Integer area() {
        return this.a*this.b;
    }
    private void showSides(){
        System.out.println("a="+ this.a+" , b=" + this.b);
    }
}

