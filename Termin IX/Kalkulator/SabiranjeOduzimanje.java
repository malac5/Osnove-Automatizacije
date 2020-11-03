package Kalkulator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SabiranjeOduzimanje {
    @Test
    @Parameters({"sab1","sab2"})
    public void saberi(int a , int b) {
        int rezultat=a+b;
        System.out.println("Zbir je: "+rezultat);
    }

    @Test
    @Parameters({"umanjenik","umanjilac"})
    public void oduzmi(int a , int b){
        int rezultat=a-b;
        System.out.println("Razlika je: "+rezultat);
    }
}
