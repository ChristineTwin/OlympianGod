public class AresSwordShield implements Weapon{

    int pointValue;

    String name;

    public AresSwordShield(){
        this.pointValue = 2000;
        this.name = "Sword and Shield";
    }
    public String getName() {
        return this.name;
    }

    public void power(){
        System.out.println("Greek army summoned!!");
    }

    public int getPointValue(){return this.pointValue;}
}
