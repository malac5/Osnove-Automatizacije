package TerminV.creditCard;

public class Card {
    public double balance;
    public Card(double balance) {
        this.balance=balance;
    }
    public void charge (double amount){
        if (this.balance>=amount){
            this.balance-=amount;
            System.out.println("Placanje uspesno!");
            System.out.println("Novo stanje je: "+this.balance);
        }else{
            System.out.println("Nemate dovoljno sredstava!");
        }
    }
}
