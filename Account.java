import java.util.Random;

public class Account {
    private int numberAccount;
    private int accountBalance;

    public Amount(){
        this.numberAccount = (int) Math.random() * 999 + 1;
        this.accountBalance = 0;
    }
    public Amount(int accountBalance){
        this.accountBalance = accountBalance;
        this.numberAccount = (int) Math.random() * 999 + 1;
    }

    public void setBalance(int balance){
        this.accountBalance = balance;
    }
    public int getBalance(){
        return this.accountBalance;
    }

    public int getAccountNumber(){
        return this.numberAccount;
    }
    public void setAccountNumber(){

    }

    public String toString(){
        return "Your account ID is " + numberAccount + " and your balance is " + accountBalance; 
    }

}
