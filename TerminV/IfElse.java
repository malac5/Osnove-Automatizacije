package TerminV;

public class IfElse {
    public static void main(String[] args) {
        String enteredName="Petar";
        String enteredPass="123";
        String storedName="Petar";
        String storedPass="Petar";

        if (enteredName==storedName && enteredPass==storedPass){
            System.out.println("Successful login");
        }

        boolean isDead=true;
             //NIJE DOBRO
        //if(isDead){
        //    System.out.println("Hero is dead.Reviving...");
        //    isDead=false;
        //}
        //if(!isDead){
        //    System.out.println("Hero is alive.");
        //}

        if (isDead){
            System.out.println("Hero id dead. Reviving...");
            isDead=false;
        }else{
            System.out.println("Hero is alive");
        }

    //USLOV ? VREDNOST AKO JE USLOV TACAN : VREDNOST AKO JE USLOV NETACAN-ternarni operator(skracenica za if else)

        System.out.println(isDead? "Heroj je mrtav":"Heroj je ziv");

    //Gnezdjenje

        byte heroState=1; //moze imati 3 stanja
        if (heroState==1){
            System.out.println("Stanje je 1");
            heroState=3;
            System.out.println("Stanje je sada 3");
        }else if (heroState==2){
            System.out.println("Stanje je 2");
        }else if (heroState==3){
            System.out.println("Stanje je 3");
        }

    //NIJE DOBRA PRAKSA
        int x=50;
        if (x<30)
            if (x>10)
                if (x<25)
                    if (x>15)
                        System.out.println("Broj je"+x);

    }
}
