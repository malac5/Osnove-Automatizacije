package Kalkulator;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mnozenje {
    @Test
    @Parameters({"cin1","cin2"})
    public void pomnozi(int a, int b){
        int rezultat=a*b;
        System.out.println("Proizvod je: "+rezultat);
    }
}
