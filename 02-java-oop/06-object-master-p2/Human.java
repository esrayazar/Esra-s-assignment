public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence =3;
    private int health =100;

    public int getStrength(){
        return this.strength;
    }
    public int getStealth(){
        return this.stealth;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public void attack(Human human){
        this.health -= human.getStrength();
    }

}
