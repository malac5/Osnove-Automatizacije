package TerminV;

public class For {
    public static void main(String[] args) {
    //Ispisuje Heloo "zauvek"
         //for(;;){
         //    System.out.println("Hello");
         //}

        for (int i=1;i<5;i++){
            System.out.println("Hello");
        }

        for (int i=1;i<11;i++){
            for (int j=1;j<21;j++){
                System.out.println("Broj redova je: "+i+" Broj kolona je: "+j);
            }
        }

        int niz[]= {1,2,3,4};
        for (int val:niz){
            System.out.println(val);
        }
    }
}
