import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numAccount;
    private static int accountTotal;
    private String accountNumber;
    // defaul constructor
    public BankAccount(){
        BankAccount.numAccount++;
        this.accountNumber = generateAccountNumber();
    }
    
    public BankAccount(String accountNum) {
        BankAccount.numAccount++;
        this.accountNumber = accountNum;
    }

    public BankAccount(String accountNum, double checkDeposit, double savingDeposit){
        BankAccount.numAccount++;
        this.accountNumber = accountNum;
        this.checkingBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }



    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

public void depositMoney(String account,double amount){
    if (account.equals("checking")){
        checkingBalance += amount;
        accountTotal += amount;
    }else if(account.equals("saving")){
        savingBalance += amount;
        accountTotal += amount;
    }
}

public void withdrawMoney(String account, double amount){
    if(account.equals("checking")){
        if (this.getCheckingBalance()-amount<0){
            System.out.println("Insufficient Funds in Checking Account");
        }else{
            checkingBalance -= amount;
            accountTotal -=amount;
        }  
    }else if(account.equals("saving")){
        if (this.getSavingBalance()-amount<0){
            System.out.println("Insufficient Funds in saving Account");
        }else{
            savingBalance-=amount;
            accountTotal -=amount;
        }
    }
}
public double seeAccountTotal(){
    return(this.getCheckingBalance() + getSavingBalance());
}
private String generateAccountNumber(){
    String tempAccountNumber = "";
    Random randMachine = new Random();
    
    for (int i=0; i<10; i++){
        int temp=randMachine.nextInt(10);
        tempAccountNumber += "" + temp;
    }
    System.out.println("System is generating customer account number="+tempAccountNumber);
    return tempAccountNumber;
}
public String showAccountNumber(){
    return this.accountNumber;
}



}
