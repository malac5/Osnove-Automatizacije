package TerminV;

public class Car {
    public static void main(String[] args) {
        String carMake ="BMW";
        int doors=5;

        if (carMake.equals("Ford")) {
            if(doors==3){
                System.out.println("Ford sa 3 vrata");
            }else if(doors==5){
                System.out.println("Ford sa 5 vrata");
            }else if(doors==7){
                System.out.println("Ford sa 7 vrata");
            }else{
                System.out.println("Ne postoji Ford sa toliko vrata");
            }
        }else if (carMake.equals("BMW")){
            if (doors==3){
                System.out.println("BMW sa 3 vrata");
            }else if(doors==5){
                System.out.println("BMW sa 5 vrata");
            }else if(doors==7){
                System.out.println("BMW sa 7 vrata");
            }else{
                System.out.println("Ne postoji BMW sa toliko vrata");
            }
        }else if (carMake.equals("Mercedes")){
            if (doors==3){
                System.out.println("Mercedes sa 3 vrata");
            }else if(doors==5){
                System.out.println("Mercedes sa 5 vrata");
            }else if(doors==7){
                System.out.println("Mercedes sa 7 vrata");
            }else{
                System.out.println("Ne postoji Mercedes sa toliko vrata");
            }
        }
    }
}
