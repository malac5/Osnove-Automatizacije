package TerminIV.dwarfWarrior;

public class DwarfWarrior extends BaseHero implements InterfaceJedan{
 //@Override
 //public void receiveHit() {
 //    this.health-=10;
 //    this.dead=this.health<=0;
 //}

    @Override
    public void primaryFire() {
        this.mane-=5;
    }

    @Override
    public void secondaryFire() {
        this.mane-=10;
    }

    public void show(){
        System.out.println("health: "+this.health+" mane: "+this.mane+" Dead? "+this.dead);
    }

    @Override
    public void receiveHit() {
        this.health-=10;
        this.dead=this.health<=0;

    }
}
