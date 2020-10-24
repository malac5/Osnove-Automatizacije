package TerminIV.vezba10;

public class Rectangle extends Shape {
    public int a;
    public  int b;

    @Override
    public void area() {
        System.out.println(this.a*this.b);
    }
}
