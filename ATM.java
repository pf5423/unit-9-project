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
                        inp = input.nextInt();
                    }
                    else if (inp == 2) {
                        System.out.println("How much was your purchase?");
                        int purchase = input.nextInt();
                        creditCard.makePurchase(purchase);
                        inp = input.nextInt();
                    }
                    else if (inp == 3) {
                        creditCard.monthlyStatement();
                    }
                    else if (inp == 4) {
                        System.out.println("Please enter the number of months you would like this paid off by: ");
                        double months = input.nextInt();
                        creditCard.monthsToPayOff(months);
                    }
                    else {
                        break;
                    }
                    continue;

                }
            }
            else if (in == 2) {
<<<<<<< Updated upstream
                continue;
            }
            else if (in == 3) {
=======
                while (true) {
                    System.out.println("");
                System.out.println("Checking Account Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Back to Main Menu");
                int inp = input.nextInt();
                if (inp == 1) {

                }
                else if (inp == 2) {

                }
                else if (inp == 3) {

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

                }
                else if (inp == 2) {

                }
                else if (inp == 3) {

                }
                else if (inp == 4) {

                }
                else {
                    break;
                }
                }
                
>>>>>>> Stashed changes
                continue;
            }
            else {
                break;
            }
        } 
System.out.println("Thank you for coming! See you again!");

    }
}
