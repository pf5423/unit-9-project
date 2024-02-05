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

    public 
}
