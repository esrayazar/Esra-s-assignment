public class TestPuzzleJava {
    public static void main(String[] args) {
        //getTenRolls
        PuzzleJava tester = new PuzzleJava();
        System.out.println(tester.getTenRolls()); 
        //getRandomLetter
        System.out.println(tester.getRandomLetter());

        //generatePassword
        System.out.println(tester.generatePassword());

        //getNewPasswordSet

        System.out.println(tester.getNewPasswordSet(5));

        //shuffleArray
        int test[] ={1,4,6,8,9,5,88,6,99,4,56};
        System.out.println(tester.shuffleArray(test));

        
    }
    
}
