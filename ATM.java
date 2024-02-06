import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please input your information");
        System.out.println("Name:");
        String name = input.nextLine();
        System.out.println("Starting credit card balance:");
        double balance = input.nextDouble();
        System.out.println("Starting savings balance:");
        double sbalance = input.nextDouble();
        System.out.println("Starting checking balance:");
        double cbalance = input.nextDouble();
        System.out.println("Credit APR:");
        double apr = input.nextDouble();
        System.out.println("Overdraft fee:");
        double fee = input.nextDouble();
        System.out.println("Interest rate:");
        double interest = input.nextDouble();
        
        Credit creditCard = new Credit(balance, apr);
        Savings savingsAccount = new Savings(sbalance, interest, name);
        Checking checkingAccount = new Checking(fee, cbalance, name);
        while (true) {
            
            


        }
    }
}
