public class Project {
    private String name;
    private String description;
    public String elevetorPitch(){
        return name + ":"+ description;
    }
    public Project(){
        System.out.println("Project() class calisti.");
    }
    public Project(String name){
        this.name = name;
        System.out.println("Project("+this.name+") class calisti.");
    }
    public Project (String name, String description){
        this.name = name;
        this.description = description;
        System.out.println("Project("+this.name+ this.description+")class calisti");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description= description;
    }

    
}
