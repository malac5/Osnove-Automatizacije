package TerminIV.zadatak4;

public class Chocolate extends Product {
    public double chocoWeight;

    public Chocolate(String productName,String barCode, double price, double chocoWeight){
        this.productName=productName;
        this.barCode=barCode;
        this.price=price;
        this.chocoWeight=chocoWeight;
    }

    @Override
    public void calcPrice() {
        super.calcPrice();
    }

    @Override
    public String toString() {
        return "Naziv proizvoda: "+this.productName+" bar kod: "+this.barCode+" osnovna cena: "+this.price+" tezina: "+this.chocoWeight+" cena sa porezom: "+this.productPrice;
    }
}
