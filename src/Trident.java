public class Trident implements Weapon{

    int pointValue = 1000;

    String name = "Trident";

    public String getName() {
        return this.name;
    }
    public void power(){
        System.out.println("Tsunami summoned!");
    }

    public int getPointValue(){return this.pointValue;}
}
