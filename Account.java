import java.util.Random;

public class Account {
    private int numberAccount;
    private double accountBalance;

    public Account(){
        this.numberAccount = (int) Math.random() * 999 + 1;
        this.accountBalance = 0;
    }
    public Account(double accountBalance){
        this.accountBalance = accountBalance;
        this.numberAccount = (int) Math.random() * 999 + 1;
    }

    public void setBalance(double balance){
        this.accountBalance = balance;
    }
    public double getBalance(){
        return this.accountBalance;
    }

    public int getAccountNumber(){
        return this.numberAccount;
    }
    public void setAccountNumber(){
        this.numberAccount = (int) Math.random() * 999 + 1;
    }

    public String toString(){
        return "Your account ID is " + numberAccount + " and your balance is " + accountBalance; 
    }

}
