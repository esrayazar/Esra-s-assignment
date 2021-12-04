import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    public ArrayList getTenRolls(){
        Random randMachine = new Random();
        ArrayList solution = new ArrayList<>();
        for (int i =0; i<10; i++){
            int temp= 1 + randMachine.nextInt(20);
            solution.add(temp);
        }
        return solution;
    }
    public String getRandomLetter(){
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random randMachine = new Random();
        int index= randMachine.nextInt(26);
        return letters[index];
    }
    public String generatePassword(){
        String password = "";
        for (int i=0; i<8; i++){
            password += getRandomLetter();
        }
        return password;
    }
    public ArrayList getNewPasswordSet(int val){
        ArrayList passwords = new ArrayList<>();
        for (int i=0; i<val; i++){
            passwords.add(generatePassword());
        }
        return passwords;
    }
    public ArrayList shuffleArray(int arr[]){
        ArrayList shuffledArray = new ArrayList<>();
        Random randMachine = new Random();
        int swapCount= 100;//randMachine.nextInt(arr.length);
        for (int i= 0; i<swapCount; i++){
            int index1= randMachine.nextInt(arr.length);
            int index2= randMachine.nextInt(arr.length);
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2]= temp;
        }
       
        for (int ele : arr) {
            shuffledArray.add(ele);
        }
        return shuffledArray;
    }

}
