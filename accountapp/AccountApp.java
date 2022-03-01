package accountapp;
import java.util.Scanner;
public class AccountApp {

    private final String name;
    private double accountBalance;
    private String lastTr = " ";
    Scanner input = new Scanner(System.in);
    
    public AccountApp(String name, double accountBalance){
        this.name = name;
        if (accountBalance > 0.0 ){
            this.accountBalance = accountBalance;
        }
    }
    
    private void withdrawal(double amount){
        if (amount > 0.0 && amount < accountBalance)
            accountBalance -= amount;
        
        if (amount > accountBalance)
            System.out.printf("Insufficient fund!%n");
             
    }
    
    private void deposit(double amount){
        if (amount > 0.0)
            accountBalance += amount;
    }
    
    public void menu(){
        
        String option;
        boolean isOptionE = false;
        do{
            
            System.out.printf("Hi, %s%n%nServices avaliable for this account%n"
                    + "[A] Balance%n"
                    + "[B] Withdawal%n"
                    + "[C] Deposit%n"
                    + "[D] Last transaction%n"
                    + "[E] Exit%n%n"
                    + "Enter an option:", name);
            
            option = input.next();
            option = option.toUpperCase();
            double amount;
            String line = "===========================================";
            
            switch(option){
                case "A":
                    System.out.printf("%s%nYour account balance is $%.2f%n%s%n%n",line , accountBalance, line);
                    break;
                case "B":
                    System.out.print("Enter amount to withdraw:");
                    amount = input.nextDouble();
                    System.out.printf("Withdrawing $%.2f%n", amount);
                    withdrawal(amount);
                    System.out.printf("%s%nYour current account balance is $%.2f%n%s%n%n",line , accountBalance, line);
                    if (amount > 0.0 && amount < accountBalance)
                        this.lastTr = "withdrawal of $" + amount;
                    break;
                case "C":
                    System.out.print("Enter amount to deposit:");
                    amount = input.nextDouble();
                    System.out.printf("Depositing $%.2f%n", amount);
                    deposit(amount);
                    System.out.printf("%s%nYour current account balance is $%.2f%n%s%n%n",line , accountBalance, line);
                    if (amount > 0.0)
                        this.lastTr = "deposit of $" + amount;
                    break;
                case "D":
                    if (lastTr != " "){
                        System.out.printf("%nYour last transaction is %s%n%n",lastTr);
                    }else{
                        System.out.printf("%nTransaction list is empty, try making a transaction!%n%n");
                    }
                    break;
                case "E":
                    System.out.print(line);
                    System.out.printf("%nThank you for banking with us,%nHave a nice day!%n");
                    isOptionE = true;
                    break;
                default:
                    System.out.println("Invalid input!, Please select A or B or C or D or E");
                    break;
            }
        }while(!isOptionE);
    }
}
