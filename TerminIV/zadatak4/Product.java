package TerminIV.zadatak4;

public abstract  class Product {
    public String productName;
    public String barCode;
    public double productPrice;
    public double price;
    public static final double pdv = 0.2;

    public void calcPrice(){
        this.productPrice = this.price+(this.price*pdv);
    }
}
