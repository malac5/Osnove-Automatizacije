package TerminV;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Unesite prvi broj:");
        int broj1= Integer.parseInt(scanner.nextLine());

        System.out.println("Unesite zeljenu racunsku operaciju:");
        String operator=scanner.nextLine();

        System.out.println("Unesite drugi broj:");
        int broj2= Integer.parseInt(scanner.nextLine());

        if(operator.equals("+")) {
            System.out.println("Rezultat je: " + (broj1 + broj2));
        } else if(operator.equals("-")) {
            System.out.println("Rezultat je: " + (broj1-broj2));
        }else if(operator.equals("*")) {
            System.out.println("Rezultat je: " + (broj1*broj2));
        }else if(operator.equals("/")) {
            System.out.println("Rezultat je: " + (broj1/broj2));
        }
    }
}
