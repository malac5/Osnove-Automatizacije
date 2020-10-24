package TerminIV.zadatak4;

public class Wine extends Product {
    public static final double pdvAdd = 0.1;
    public double bottleVolume;
    public double addPdvPrice;

    public Wine(String productName, String barCode, double price, double bottleVolume){
        this.productName = productName;
        this.barCode = barCode;
        this.price = price;
        this.bottleVolume = bottleVolume;
    }

    @Override
    public void calcPrice() {
        this.productPrice = this.price+(this.price*Product.pdv);
        this.addPdvPrice = this.productPrice+(this.productPrice*pdvAdd);
    }

    @Override
    public String toString() {
        return "Naziv proizvoda: "+this.productName+" bar kod: "+this.barCode+" osnovna cena: "+this.price+" zapremina boce: "+this.bottleVolume+" cena sa porezom: "+this.productPrice+" cena sa dodatnim porezom "+this.addPdvPrice;
    }
}
