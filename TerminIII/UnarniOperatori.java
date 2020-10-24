package TerminIII;

import netscape.security.Privilege;

public class UnarniOperatori {
    public static void main(String[] args) {
 /*Inkrement Dekrement
    operatori omogucavaju povecanje, odnosno, smanjenje promenljive za jedan

        int x=10;
        x++;
        ++x;
        x--;
        --x;
*/


        int x =10;
        int y =++x;

        System.out.println(x);
        System.out.println(y);

        int r=10;
        int k=x++;
        System.out.println(r);
        System.out.println(k);

        int a=2;
        int b=3;
        int res=a+ b++;
        int result=a+ ++b;
        int res1=a*(b++)+b;
        int res2=a*(++b)+b;

        System.out.println(res);
        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);

//Negacija-(!) negira izjavu koja sledi

        boolean isbetter=!true;
        System.out.println(isbetter);





    }
}

