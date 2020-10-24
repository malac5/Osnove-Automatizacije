package TerminIV.vezba10;

public class Square extends Shape {
    public int a;
    public int b;

    @Override
    public void area() {
        System.out.println(this.a*this.a);
    }
}
