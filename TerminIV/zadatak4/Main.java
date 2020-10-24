package TerminIV.zadatak4;

public class Main {
    public static void main(String[] args) {
        Wine wine = new Wine("Vranac","987354637",500.00,0.75);
        wine.calcPrice();
        System.out.println(wine);

        Chocolate chocolate=new Chocolate("Milka","2346574",250.00,100.00);
        chocolate.calcPrice();
        System.out.println(chocolate);


    }
}
