public class LighteningBolt implements Weapon{

    int pointValue = 1000;

    String name = "Lightening Bolt";

    public String getName() {
        return this.name;
    }
    public void power(){
        System.out.println("ZAPPP!!");
    }

    public int getPointValue(){return this.pointValue;}
}
