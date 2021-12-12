import java.util.ArrayList;

public class ListOfExceptions{
   public static void exceptionExample(){
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    
    for(int i = 0; i < myList.size(); i++) {
        try{
        Integer castedValue = (Integer) myList.get(i);
        }catch(ClassCastException e){
            System.out.println("\n Error at Index"+ e+ " "+ i + myList.get(i));
        }
    
    }

    
    


   }

}