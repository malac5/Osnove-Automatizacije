package TerminIV.person;

public class Kalkulator {
    double broj1;
    double broj2;

    public Kalkulator (double broj1, double broj2) {
        this.broj1=broj1;
        this.broj2=broj2;
    }

    public void add (double br1, double br2) {
        double result= br1+br2;
        System.out.println(result);
    }

    public void sub (double br1, double br2) {
        double result= br1-br2;
        System.out.println(result);
    }

    public void mul (double br1, double br2) {
        double result= br1*br2;
        System.out.println(result);
    }

    public void div (double br1, double br2) {
        double result= br1/br2;
        System.out.println(result);
    }
}
