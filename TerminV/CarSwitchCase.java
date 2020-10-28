package TerminV;

public class CarSwitchCase {
    public static void main(String[] args) {
        String carMake ="Mercedes";
        int doors=9;

        switch (carMake){
            case"Ford":
                switch (doors){
                    case 3:
                        System.out.println("Ford sa 3 vrata");
                        break;
                    case 5:
                        System.out.println("Ford sa 5 vrata");
                        break;
                    case 7:
                        System.out.println("Ford sa 7 vrata");
                        break;
                    default:
                        System.out.println("Ne postoji Ford sa toliko vrata");
                        break;
                } break;
            case"BMW":
                switch (doors){
                    case 3:
                        System.out.println("BMW sa 3 vrata");
                        break;
                    case 5:
                        System.out.println("BMW sa 5 vrata");
                        break;
                    case 7:
                        System.out.println("BMW sa 7 vrata");
                        break;
                    default:
                        System.out.println("Ne postoji BMW sa toliko vrata");
                        break;
                } break;
            case"Mercedes":
                switch (doors){
                    case 3:
                        System.out.println("Mercedes sa 3 vrata");
                        break;
                    case 5:
                        System.out.println("Mercedes sa 5 vrata");
                        break;
                    case 7:
                        System.out.println("Mercedes sa 7 vrata");
                        break;
                    default:
                        System.out.println("Ne postoji Mercedes sa toliko vrata");
                        break;
                } break;
        }
    }
}
