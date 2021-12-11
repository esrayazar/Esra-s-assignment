public class Gorilla extends Mammal {
    public Gorilla(){
        super();
    }
    public Gorilla(int energyLevel){
        super(energyLevel);
    }
    public void throwSomething(){
        System.out.println("The gorilla has thrown something");
        this.energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("The gorilla has eatan bananas");
        this.energyLevel +=10;
    }
    public void climb(){
        System.out.println("The gorilla has been climbed the tree.");
        this.energyLevel -=10;
    }

    
}
