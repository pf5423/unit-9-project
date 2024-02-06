
public class Credit extends Account{
    private double apr;

    public Credit(){
        super();
        apr = 0;
    }
    public Credit(double balance, double apr){
        super(balance);
        this.apr = apr;
    }
    public double getAPR(){
        return this.apr;
    }
    public void setAPR(double apr){
        this.apr = apr;
    }

    public void makePurchase(double purchase){
        super.setBalance(super.getBalance()+purchase);
    }
    public void monthlyStatement(){
        System.out.println("If paided on time, your balance is " + super.getBalance());
        System.out.println("If not paided on time, your balance is: " + (super.getBalance() * (this.apr/12)));
    }
    public double monthsToPayOff(double months){
        return ((Math.pow((1 + (this.apr/12)), months) * (this.apr/12))/(Math.pow(1 + (this.apr/12), months) - 1)) * super.getBalance();
    }

    @Override
    public String toString(){
        return "APR: " + apr + ". Balance: " + super.getBalance();
    }

}
