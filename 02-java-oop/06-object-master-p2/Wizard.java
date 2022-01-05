public class Wizard extends Human{
    public int health = 50;
    public int intelligence =8;
    //heal
    public void heal(Human human){
        int humanHealth = human.getHealth();
        humanHealth+=this.intelligence;
        human.setHealth(humanHealth);

    }
    //fireball
    public void fireball(human human){
        int humanHealth = human.getHealth();
        humanHealth -= 3* this.intelligence;
        human.setHealth(humanHealth);

    }
    
}
