package Practice;

public class BankAccount {

    String accountHolder;
    String accountNum;
    double balance = 0;

    public BankAccount(String accountHolder, String accountNum) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
    }

    public void deposit(double amount){
       if(amount<=0){
           System.err.println( "Depositing amount can not be zero or negative");
       }else {
           balance+= amount;
       }
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance ");
        }else if(amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero");
        }else {
            balance-= amount;
        }

    }
    public void checkBalance(){
        System.out.println("As of today, " + accountHolder + " available balance is: " + balance);
    }
}
