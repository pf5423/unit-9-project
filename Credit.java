
public class Credit extends Bank{
    private double apr;

    public Credit(){
        super();
        apr = 0;
    }
    public Credit(String name, double balance, double apr){
        super(name, balance);
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
    public double monthlyStatement(boolean statement){
        if (statement == true){
            return super.getBalance();
        }
        else {
            return super.getBalance() * (this.apr/12);
        }
    }
    public double monthsToPayOff(double months){
        return ((Math.pow((1 + (this.apr/12)), months) * (this.apr/12))/(Math.pow(1 + (this.apr/12), months) - 1)) * super.getBalance();
    }
    public String toString(){
        return "APR: " + apr;
    }

}
