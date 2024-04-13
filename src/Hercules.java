import java.util.ArrayList;

public class Hercules implements Hero{

    ArrayList<Weapon> weapons;
    String name;
    int powerLevel;
    boolean isGod;

    public Hercules(String name){
        this.powerLevel = 100;
        this.name = name;
        this.weapons = new ArrayList<Weapon>();
    }

    public int getPowerLevel(){return this.powerLevel;}

    public void collectWeapon(Weapon weapon) {
        weapons.add(weapon);

        this.evolve(weapon.getPointValue());
    }

    public void useWeapon(String weapon) {
        for(Weapon w : weapons) {
            if(w.getName().equals(weapon)){
                w.power();
            }
        }

    }

    public void evolve(int points) {
        powerLevel += points;
        if (powerLevel > 4000){
            this.isGod = true;
        }

    }

    public boolean getIsGod(){return this.isGod;}

    @Override
    public String toString(){return this.name + " has " + this.weapons;}
}
