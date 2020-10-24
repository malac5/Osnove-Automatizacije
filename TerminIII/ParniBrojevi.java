package TerminIII;

import java.util.Scanner;

public class ParniBrojevi {
    public static void main(String[] args) {
        System.out.println("Unesite ceo broj:");

        Scanner scanner=new Scanner(System.in);

        int x= Integer.parseInt(scanner.nextLine());

        if (x%2==0){
            System.out.println("Broj: " +x+" je paran");
        }else{
            System.out.println("Broj: " +x+" nije paran");
        }
    }
}