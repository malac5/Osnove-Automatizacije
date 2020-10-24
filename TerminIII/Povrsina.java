package TerminIII;

public class Povrsina {
    final static String measure="cm";
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int res= a*b;
        String message="Rectangle area is "+a+ measure + "*" + b + measure + "=" + res + measure;
        System.out.println(message);
    }
}
