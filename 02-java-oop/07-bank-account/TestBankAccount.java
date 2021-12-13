import java.sql.Savepoint;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        BankAccount customer2 = new BankAccount("1709198399");
        BankAccount customer3 = new BankAccount("0407198799", 1000, 5000);
        System.out.println("Preparing account info");
        customer1.depositMoney("checking",5000);
        customer1.depositMoney("checking", 100);
        customer1.depositMoney("saving", 400);
        customer1.depositMoney("saving", 5678);
        customer1.withdrawMoney("saving", 40000);
        customer1.withdrawMoney("checking", 40000);
        System.out.println(customer1.getCheckingBalance()); 
        System.out.println(customer1.getSavingBalance());
        System.out.println(customer1.seeAccountTotal());
        System.out.println("customer account number = " + customer1.showAccountNumber());
        System.out.println("customer account number = " + customer2.showAccountNumber());
        System.out.println("customer account number = " + customer3.showAccountNumber());
        System.out.println(customer3.getCheckingBalance()); 
        System.out.println(customer3.getSavingBalance());
        System.out.println(customer3.seeAccountTotal());
    }
    
}
