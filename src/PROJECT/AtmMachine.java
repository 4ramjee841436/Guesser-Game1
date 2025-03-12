package PROJECT;

import java.util.Scanner;
 class ATM
 {
    float Balance;
    int PIN=7370;

    public void checkpin()
    {
        System.out.println("Enter your pin: ");
        Scanner sc= new Scanner(System.in);
        int enterpin= sc.nextInt();
        if(enterpin == PIN  )
            menu();
        else
            System.out.println("please Enter a Valid pin: ");
        menu();

    }
    public void menu()
    {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Amount ");
        System.out.println("3. Deposite Amount: ");
        System.out.println("4. EXIT");

        Scanner sc= new Scanner(System.in);
        int opt= sc.nextInt();
        if(opt ==1)
            checkBalance();
        else if(opt ==2)
            withdrawmoney();
        else if(opt ==3)
            depositemoney();
        else if (opt == 4)
            return;
        else
            System.out.println("Enter a Valid Choice: ");

    }
    public void checkBalance()
    {
        System.out.println(" Your  Current Balance is: "+Balance);
        menu();
    }
    public void withdrawmoney()
    {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>Balance)
            System.out.println("You have Insufficient Balance: ");
        else {
            Balance= Balance-amount;
            System.out.println("Money Withdraw Successfully: ");
        }
        menu();
    }
    public void depositemoney()
    {
        System.out.println("Enter the Amount: ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance= Balance+amount;
        System.out.println("Money Deposited Successfully: ");
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.checkpin();

    }
}
