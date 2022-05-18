/*Create classes that capture bank customers and bank accounts. A customer has a first and last 
name. An account has a customer and a balance. Make objects for two accounts held by the 
same customer.*/

import java.util.*;
 class Account {
    private String name;
    private int  acc_number;
    private int balance;
    
    void Create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name ");
        name=sc.next();
        System.out.println("Enter account name");
        acc_number=sc.nextInt();
        System.out.println("Enter initial balance");
        balance=sc.nextInt();

    }
    void print(){
        System.out.println("Account number"+acc_number);
        System.out.println("name"+name);
        System.out.println("Balance"+balance);
    }
    void deposite(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter amount to deposite");
        int amount=sc.nextInt();
        balance=balance+amount;

    }
    void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int amount=sc.nextInt();
        balance=balance-amount;

    }
    
}
   class BankAccount{
       public static void main(String[] args) {
           Scanner sc=new Scanner (System.in);
    
        Account sc1=new Account();
        sc1.Create();
        sc1.deposite();   
        sc1.print();
       }
   }