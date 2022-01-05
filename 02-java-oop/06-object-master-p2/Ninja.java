public class Ninja extends Human{
    public int stealth = 10;
    
    public void steal(Human human){
        int humanHealth = human.getHealth();
        humanHealth-=this.stealth;
        this.health += this.stealth;
        human.setHealth(humanHealth);
    }

    public void runAway(){
        this.health -= 10;

    }
}
