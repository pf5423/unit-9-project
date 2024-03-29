public class Bank extends Account {
    private String name;

    public Bank(){
        super();
        this.name = "Unknown";
    }

    public Bank(String name, double balance){
        super(balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

public void deposit(double i) {
    super.setBalance(super.getBalance() + i);
}

public void withdraw(double i) {
    super.setBalance(super.getBalance() - i);
}

public String toString() {
    return "Hi " + name + ", " + super.toString();
}

}
