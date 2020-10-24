package TerminIII;

import java.util.Scanner;

public class LogickiOperatori {
    public static void main(String[] args) {
/*
  && (AND)
  || (OR)
  ?: (if-then-else)
 */
        int x=10;
        int y=20;
        boolean res = x<20 && x>10;
        System.out.println(res);

        boolean res1= x<20 || x>10;
        System.out.println(res1);

        boolean res2= x==10 || ++y==20;
        System.out.println(res2);

        boolean res3= x==11 && ++y==20;
        System.out.println(res3);

        boolean res4=(x>9 && x!=25 && y>19 && x!=10) || y!=20 && y==10 || (x==1 && x==2 && x==3) || true;
        System.out.println(res4);

    }
}
