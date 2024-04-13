public class GameDriver {

    public static void main(String[] args){
        System.out.println("Testing Leo's Game 4/13/24\n");


        System.out.println("Testing making a Hero. Hercules!");
        Hero Hercules = new Hercules("Hercules");
        System.out.println(Hercules);
        AresSwordShield sword_shield = new AresSwordShield();
        System.out.println(sword_shield);
        Trident trident = new Trident();
        System.out.println(trident);
        LighteningBolt bolt = new LighteningBolt();
        System.out.println(bolt);
        Hercules.collectWeapon(sword_shield);
        System.out.println(Hercules);
        Hercules.useWeapon("Sword and Shield");
        Hercules.collectWeapon(trident);
        System.out.println(Hercules);
        Hercules.useWeapon("Trident");
        Hercules.collectWeapon(bolt);
        System.out.println(Hercules);
        Hercules.useWeapon("Lightening Bolt");
        System.out.println("Hercules is a God!!" + Hercules.getIsGod());
    }

}
