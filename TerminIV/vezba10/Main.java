package TerminIV.vezba10;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();

        circle.r=5;

        rectangle.a=3;
        rectangle.b=5;

        square.a=2;

        circle.area();
        rectangle.area();
        square.area();

    }
}
