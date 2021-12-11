public class Mammal {
    int energyLevel;
    public Mammal(){
      this.energyLevel=100;
    }
    public Mammal(int el){
      this.energyLevel=el;

    }
  public int displayEnergy(){
      System.out.println(this.energyLevel);
      return this.energyLevel;
  }

    
}
