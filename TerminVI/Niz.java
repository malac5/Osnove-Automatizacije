package TerminVI;

public class Niz {
    public static void main(String[] args){

    //Jednodimenzionalni niz + vezba 19

        String [] pojmovi={"Bicikla","Automobil","Mobilni"};
        String [] naziv={"BMX","Renault","I-Phone"};
        double [] cena={100.20,500.54,150.50};

        for (int i=0;i<3;i++){
            System.out.println(naziv[i]+" je tipa "+pojmovi[i]+" i cena je "+cena[i]);
        }


    //Visedimenzionalni niz

        int[][] square={
                {10,10},{100,10},{100,100},{10,100}
        };


        String [][] pojmovii={
            {"Bicikla","Automobil","Mobilni"},
            {"BMX","Renault","I-Phone"},
            {"100.20","500.54","150.50"}
        };

        for (int i=0;i<pojmovii.length;i++){
            System.out.println(pojmovii[i][0]+" \n");
            System.out.println(pojmovii[i][1]+" \n");
            System.out.println(pojmovii[i][2]+" \n");
        }

    //Nazupceni niz
        String [][] pojmoviii={
                {"Bicikla","Automobil","Mobilni"},
                {"BMX","Renault","I-Phone"},
                {"100.20","500.54"}
        };

        for (int i=0;i<pojmoviii.length;i++){
            for (int j=0;j<pojmoviii[i].length;j++){
                System.out.println(pojmoviii[i][j]);
            }
        }


    }
}
