package TerminV;

import java.util.Scanner;

public class KalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("unesite prvi broj:");
        int broj1= Integer.parseInt(scanner.nextLine());

        System.out.println("Unesite zeljenu racunsku operaciju(+,-,*,/):");
        String operator=scanner.nextLine();

        System.out.println("Unesite drugi broj:");
        int broj2= Integer.parseInt(scanner.nextLine());

        switch (operator){
            case "+":
                System.out.println("Rezultat je: " + (broj1 + broj2));
                break;
            case "-":
                System.out.println("Rezultat je: " + (broj1 - broj2));
                break;
            case "*":
                System.out.println("Rezultat je: " + (broj1 * broj2));
                break;
            case "/":
                System.out.println("Rezultat je: " + (broj1 / broj2));
                break;
            default:
                System.out.println("Unesite dozvoljenu operaciju");


        }


    }
}

