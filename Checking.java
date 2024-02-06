public class Checking extends Bank {
    private double fee;

    public Checking() {
        super();
        this.fee = 0;
    }

    public Checking(double fee, double balance, String name) {
        super(name, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double f) {
        fee = f;
    } 

public void withdraw(double i) {
    super.withdraw(i);
    if (super.getBalance() < 0) {
        super.withdraw(fee);
    }
}

    public String toString() {
        return super.toString() + ". Your overdraft fee is " + fee;
    }
}
