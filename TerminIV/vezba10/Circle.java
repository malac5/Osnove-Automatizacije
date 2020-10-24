package TerminIV.vezba10;

public class Circle  extends Shape {
    public final static double PI=3.14;
    public int r;

    @Override
    public void area() {
        System.out.println(this.r*this.r*Circle.PI);
    }
}
