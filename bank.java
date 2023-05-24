package practical;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class bank {
    int balance=1000;

    void Withdraw(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }else{
            System.out.println("Balance is insufficient");
        }
 

    }
    void checkbalance(){
        System.out.println("Your balance is : " + balance);
    }
    void deposit(){
        System.out.println("Enter the amount to deposit : ");   
        int amount;
        Scanner sc =new Scanner(System.in);
        amount = sc.nextInt();
        balance = balance + amount;

    }
    public static void main(String[] args) {
        bank b = new bank();
        Scanner sc =new Scanner(System.in);
        int a=0;
        System.out.println("What you want to do in Bank");

        while(a != 4){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. bankbalance");
            System.out.println("4.exit");
            a = sc.nextInt();
            switch(a){
                case 1: {
                    b.deposit();
                    break;
                }
                
                case 2: {
                    b.Withdraw(sc.nextInt());
                    break;
                }
                case 3:{
                    b.checkbalance();
                    break;
                }
                case 4:{
                System.out.println("Thank you for using Bank");
                break;
                }
                default:{
                    System.out.println("Invalid option");
                    break;
                }

            }
        }
    }
    
}
