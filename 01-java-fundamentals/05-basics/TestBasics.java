public class TestBasics {
    public static  void main(String[] args) {
        Basics tester = new Basics();
        tester.printNums();
        tester.printOddNumbers();
        System.out.println(tester.sigma255());
        //iterating through an array
        int[] testintarray = {1,3,5,7,9,13};
        tester.printIntArray(testintarray);

        // Max value
        int[] testintarray2 = {1,3,-19,5,7,9,-5,13,-587};
        tester.findMax(testintarray2);

        //Array with odd numbers
        tester.oddNumbersArray();

        //Get Average
        tester.getAverage(testintarray);

        //Greater than y
        System.out.println("greater than y: "+tester.greaterThan(testintarray,4));

        //Square the values
        tester.squareValues(testintarray);

        //Eliminate Negative Numbers
        tester.eliminateNegatives(testintarray2);

        //Max, Min, Average
        System.out.println(tester.maxMinAverage(testintarray));

        //Shifting the Values in the Array
        tester.shiftingValues(testintarray);



    }
    
    
}
