public class Bat extends Mammal {
    //public int energyLevel = 300;

    public Bat(int el){
        // this.displayEnergy = energyLevel;
        super(el);
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
