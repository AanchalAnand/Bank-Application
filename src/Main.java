import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name,password and initial balance");
        String name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();

        SBIAccount AanchalAccount=new SBIAccount(name,balance,password);

        System.out.println("Your account has been credited with account number: "+AanchalAccount.getAccountNo());

        //getbalance
        System.out.println("Your current balance is: "+AanchalAccount.getBalance());
        //deposit
        System.out.println(AanchalAccount.depositMoney(500));
        System.out.println("New balance is: "+AanchalAccount.getBalance());

        //withdraw
        System.out.println("Enter amoutnt to be withdrawn: ");
        int amount=sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword=sc.next();
        System.out.println(AanchalAccount.withdraw(amount,enteredPassword));

        //interest
        System.out.println("Interest for 4 years on current balance "+AanchalAccount.getBalance()+" is "+AanchalAccount.calculateInterest(4));

    }
}