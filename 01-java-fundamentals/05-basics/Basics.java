import java.util.ArrayList;

public class Basics {
    public void printNums(){
        for (int i =1; i<256; i++)
        System.out.println(i);
    }
    public void printOddNumbers(){
        for (int i=1; i<256; i=i+2)
        System.out.println(i);
    }

    public int sigma255(){
        int sum =0;
        for(int i=1; i<256; i++){
            sum=sum+i;
        }
        return sum;
    }
    public void printIntArray(int arr[]){
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
    public void findMax(int arr[]){
        int max= Integer.MIN_VALUE;
        for (int ele : arr) {
            if(ele>max) max=ele;
        }
        System.out.println("maxNum=" + max);
    }
    public void oddNumbersArray(){
        ArrayList y = new ArrayList<>();
       for(int i=1; i<256; i=i+2) y.add(i);
       System.out.println(y);
       
    }
    public void getAverage(int arr[]){
        int sum =0;
        for (int ele : arr) {
            sum=sum+ele;
        }
        if(arr.length!=0){
            System.out.println("average= " + sum/arr.length);
        }
    }

    public int greaterThan(int arr[], int y){
        int count = 0;
        for (int ele : arr) {
            if (ele>y)
            count++;
        }
        return count;

    }
    public void squareValues(int arr[]){
        ArrayList y = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            y.add(arr[i]*arr[i]);
        }
        System.out.println(y);
    }

    public void eliminateNegatives(int arr[]){
        ArrayList y =new ArrayList<>();
        for (int ele : arr) {
            if(ele<0)y.add(0);
            else y.add(ele);
        }
        System.out.println(y);
    }

    public ArrayList maxMinAverage(int arr[]){
        ArrayList y = new ArrayList<>();
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int sum = 0;
        for (int ele : arr) {
            if(ele>max) max=ele;
            if (ele<min) min=ele;
            sum = sum+ele;
        }
        y.add(max);
        y.add(min);

        if (arr.length>0){y.add(sum/arr.length);}
        else y.add(0);

        return y;

    }

    public void shiftingValues(int arr[]){
        ArrayList solution = new ArrayList<>();
        if (arr.length==0)
        System.out.println("array is empty");
        else if (arr.length==1)
        solution.add(0);
        else {
            for(int i= 1; i<arr.length; i++) solution.add(arr[i]);
            solution.add(0);
        }
        System.out.println(solution);
    }


}
