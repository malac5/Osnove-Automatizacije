package TerminVI;

import java.util.Random;

public class Slot {
    public static void main(String[] args){
        String[] slotIkonice={"Heart","Chery","Melon","Joker"};
        System.out.println("Vasa kombinacija je:");
        for (int i=0;i<slotIkonice.length;i++){
            Random r=new Random();
            int rand=r.nextInt(slotIkonice.length);
            System.out.println(slotIkonice[rand]);
        }


        for (String val:slotIkonice){
            System.out.println(val);
        }


        int counter=0;
        while (counter<slotIkonice.length){
            System.out.println(slotIkonice[counter++]);
        }

    }
}
