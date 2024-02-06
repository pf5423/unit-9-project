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

        System.out.println("");
        System.out.println(creditCard.toString());
        System.out.println(savingsAccount.toString());
        System.out.println(checkingAccount.toString());
        
        while (true) {
            
            System.out.println("Welcome to the Bank!");
            System.out.println("1. Credit Card");
            System.out.println("2. Checking");
            System.out.println("3. Savings");
            System.out.println("4. Exit");

            int in = input.nextInt();

            if (in == 1) {
                while (true) {
                    System.out.println("");
                    System.out.println("Credit Card Menu");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Make Purchase");
                    System.out.println("3. Display Monthly Statement");
                    System.out.println("4. Create Monthly Payments");
                    System.out.println("5. Back to Main Menu");

                    int inp = input.nextInt();

                    if (inp == 1) {
                        System.out.println("Account Number: " + creditCard.getAccountNumber());
                        System.out.println("Account number: " + creditCard.getBalance());
                        System.out.println("APR: " + creditCard.getAPR());
                       
                    }
                    else if (inp == 2) {
                        System.out.println("How much was your purchase?");
                        int purchase = input.nextInt();
                        creditCard.makePurchase(purchase);
                        
                    }
                    else if (inp == 3) {
                        creditCard.monthlyStatement();
                        
                    }
                    else if (inp == 4) {
                        System.out.println("Please enter the number of months you would like this paid off by: ");
                        double months = input.nextInt();
                        System.out.println("Your monthly payment will be: " + creditCard.monthsToPayOff(months));
                        
                    }
                    else {
                        break;
                    }
                    continue;

                }
            }
            else if (in == 2) {
                while (true) {
                    System.out.println("");
                System.out.println("Checking Account Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Back to Main Menu");
                int inp = input.nextInt();
                if (inp == 1) {
                    System.out.println("Name: " + checkingAccount.getName());
                    System.out.println("Account ID: " + checkingAccount.getAccountNumber());
                    System.out.println("Balance: " + checkingAccount.getBalance());
                    System.out.println("Fee: " + checkingAccount.getFee());
                    
                    
                    
                }
                else if (inp == 2) {
                    System.out.println("How much would you like to withdraw?");
                    double withdraw = input.nextDouble();
                    checkingAccount.withdraw(withdraw);
                }
                else if (inp == 3) {
                    System.out.println("How much would you like to deposit?");
                    double deposit = input.nextDouble();
                    checkingAccount.deposit(deposit);
                }
                else {
                    break;
                }
                }
                
                continue;
            }
            else if (in == 3) {
                while (true) {
                    System.out.println("");
                System.out.println("Savings Account Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Display Months until Goal");
                System.out.println("5. Back to Main Menu");
                int inp = input.nextInt();
                if (inp == 1) {
                    System.out.println("Name: " + savingsAccount.getName());
                    System.out.println("Account ID: " + savingsAccount.getAccountNumber());
                    System.out.println("Balance: " + savingsAccount.getBalance());
                    System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
                }
                else if (inp == 2) {
                    System.out.println("How much would you like to withdraw? ");
                    double withdrawal = input.nextDouble();
                    savingsAccount.withdraw(withdrawal);
                }
                else if (inp == 3) {
                    System.out.println("How much would you like to deposit? ");
                    double depositing = input.nextDouble();
                    savingsAccount.deposit(depositing);
                }
                else if (inp == 4) {
                    System.out.println("What would you like your savings account goal to be? ");
                    double goal = input.nextDouble();
                    System.out.println("It will take you " + savingsAccount.amountInAccount(goal) + " months to get $" + goal);
                }
                else {
                    break;
                }
                }
                
                continue;
            }
            else {
                break;
            }
        } 
System.out.println("Thank you for coming! See you again!");

    }
}
