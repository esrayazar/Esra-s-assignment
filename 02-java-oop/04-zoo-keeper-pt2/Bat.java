public class Bat {
    public int energyLevel = 300;

    public Bat(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public void fly(){
        this.energyLevel -=50;
        System.out.println("The bat is flying");

    }
    public void eatHumans(){
        this.energyLevel +=25;
        System.out.println("Bat is eating humanss");
    }
    public void attackTown(){
        this.energyLevel -=100;
        System.out.println("OMG!! Bat is attacking the town..");

    }
}
