package TerminVI;


import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args){
        while(true){
            Random r = new Random();
            int zamisljeniBroj = r.nextInt(3);
            System.out.println("Koji broj sam zamislio?");
            Scanner sc = new Scanner(System.in);
            int pokusaj = sc.nextInt();
            if (pokusaj==zamisljeniBroj){
                System.out.println("Bravo pogodili ste broj: "+zamisljeniBroj);
                continue;
            } else {
                System.out.println("Pokusajte ponovo");
            }
        }
    }
}
