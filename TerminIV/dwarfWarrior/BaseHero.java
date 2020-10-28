package TerminIV.dwarfWarrior;

public  abstract class BaseHero {
    public double health;
    public double mane;
    public boolean dead;

    public void ereaOfEffectHit(){
       // receiveHit();
    }
    //public abstract void receiveHit();
    public abstract void primaryFire();
    public abstract void secondaryFire();


}
