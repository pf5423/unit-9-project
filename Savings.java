public class Savings extends Bank{
    private double interestRate;

    public Savings(){
        super();
        this.interestRate = 0.0;
    }
    public Savings(double balance, double interestRate, String name){
        super(name, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return this.interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double amountInAccount(double idealMoney){
        return (Math.log(idealMoney/super.getBalance())) / (12 * Math.log(1 + (this.interestRate / 12)));
    }

    public void withdraw(double withdraw){
        if ((super.getBalance() - withdraw) < 0){
            System.out.println("The amount cannot be withdrawn as your balance is less than the withdrawal");
        }
        else {
            super.withdraw(withdraw);
        System.out.println("The amount has been successfully withdrawn");
        }
        
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
