public class Samurai extends Human{
    public int health = 200;

    public void deathBlow(Human human){
        human.setHealth(0);
        this.health = this.health/2;
    }
    public void meditate(){
        this.health += this.health/2;
    }

    public int howMany(){
        return 0;
    

    }
    
}
