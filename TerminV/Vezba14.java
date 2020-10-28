package TerminV;

public class Vezba14 {
    public static void main(String[] args) {
        int x=523134;
        int y=325423;

        if(x%y==0){
            System.out.println("Nema ostatka pri deljenju ova dva broja");
        }else if(x%y>=1000){
            System.out.println("Ostatak pri deljenju je veci od 1000");
        }else {
            System.out.println("Ostatak pri deljenju je manji od 1000");
        }
    }
}
