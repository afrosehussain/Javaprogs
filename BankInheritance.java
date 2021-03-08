/*a Java program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept*/
/**********************************************
*Lab session number      : 05
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose Hussain
*Date                    : 04/02/2021
*Program name            : BankInheritance.java
*Topics                  : Variables, Data types, Conrol statements, operators
                            Classes, Objects, constructors, inheritance & its types
                            this and super keyword, dynamic polymorphism
                            Method Overriding
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

class RBI{
    public double minInt, minBal, maxWit;
    public double bal;
   
    public void setBal(double b){
        bal = b;
    }
    
    void calInterest(int months){
        double intAmt = (bal * minInt * ((double)months / 12.0)) / 100.0;
        bal = bal + intAmt;
    }
    
    public void withdrawl(double amt){
        if(amt > maxWit){
            System.out.println("Maximum withdrawl is " + maxWit +", You cannot draw amount more than that");
            return;
        }
        if(bal - amt < minBal){
            System.out.println("Maintain minimum balance");
        }else{
            bal = bal - amt;
            System.out.println("Remaining Balance is " + String.format("%.2f",bal));
        }
    }
    
}


class SBI extends RBI{
    public SBI(double minInt, double minBal, double maxWit){
        super.minInt=minInt;
        super.minBal=minBal;
        super.maxWit=maxWit;
    }
    
}

class ICICI extends RBI{
    public ICICI(double minInt, double minBal, double maxWit){
        super.minInt=minInt;
        super.minBal=minBal;
        super.maxWit=maxWit;
    }
    
}

class PNB extends RBI{
    public PNB(double minInt, double minBal, double maxWit){
        super.minInt=minInt;
        super.minBal=minBal;
        super.maxWit=maxWit;
    }
    
}

class Customer{
    String name;
    int id;
    
    public  Customer(String n, int num, String accType, double deposit_amt, int months, double withdrawl_amt){
        name = n;
        id = num;
        Account a = new Account(accType, deposit_amt, months, withdrawl_amt);
    }
}


class Account{
    public double deposit_amt, withdrawl_amt;
    public int months;
    public String accType;
    public Account(String accType, double deposit_amt, int months, double withdrawl_amt){
        this.accType = accType;
        this.deposit_amt = deposit_amt;
        this.months = months;
        this.withdrawl_amt = withdrawl_amt;
        
        if(accType.equals("SBI")){
        SBI s = new SBI(5, 2000, 7500);
        s.setBal(deposit_amt);
        s.calInterest(months);
        s.withdrawl(withdrawl_amt);
        
    }
    
    if(accType.equals("ICICI")){
        ICICI i = new ICICI(6, 2500, 7500);
        i.setBal(deposit_amt);
        i.calInterest(months);
        i.withdrawl(withdrawl_amt);
        
    }
    
    if(accType.equals("PNB")){
        PNB p = new PNB(7, 3000, 7500);
        p.setBal(deposit_amt);
        p.calInterest(months);
        p.withdrawl(withdrawl_amt);
        
    }
    }
    
    
    
}

public class BankInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bankName, name;
        int id, months;
        double deposit_amt, withdrawl_amt;
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Bank Name: ");
        bankName = sc.nextLine();
        System.out.print("Enter Customer Id: ");
        id = sc.nextInt();
        System.out.print("Enter Deposit Amount: ");
        deposit_amt = sc.nextDouble();
        System.out.print("Enter number of months: ");
        months = sc.nextInt();
        System.out.print("Enter withdrawl amount: ");
        withdrawl_amt = sc.nextDouble();
        
        Customer c = new Customer(name, id, bankName, deposit_amt, months, withdrawl_amt);
    }
}