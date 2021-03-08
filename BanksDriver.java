import java.util.*;

class RBI{
    public double minInt, minBal, minWit;
    public double bal;
    /*public RBI(double minInt, double minBal, double minWit){
        minInt = this.minInt;
        minWit = this.minWit;
        minBal = this.minBal;
    }
    */
    public void setBal(double b){
        bal = b;
    }
    
    void calInterest(int months){
        double intAmt = (bal * minInt * ((double)months / 12.0)) / 100.0;
        bal = bal + intAmt;
    }
    
    public void withdrawl(double amt){
        if(amt < minWit){
            System.out.println("Minimum withdrawl is " + minWit +", please draw amount more than that");
            return;
        }
        if(bal - amt < minBal){
            System.out.println("Maintain minimum balance");
        }else{
            bal = bal - amt;
            System.out.println("Remaining Balance is " + bal);
        }
    }
    
}


class SBI extends RBI{
    //public double minInt = 5, minBal = 5000, minWit = 1000;
    //public double interest, bal, wit;
    public SBI(double minInt, double minBal, double minWit){
        super.minInt=minInt;
        super.minBal=minBal;
        super.minWit=minWit;
    }
    
}

class ICICI extends RBI{
    //public double minInt = 5, minBal = 5000, minWit = 1000;
    //public double interest, bal, wit;
    public ICICI(double minInt, double minBal, double minWit){
        super.minInt=minInt;
        super.minBal=minBal;
        super.minWit=minWit;
    }
    
}

class PNB extends RBI{
    //public double minInt = 6, minBal = 5000, minWit = 1000;
    //public double interest, bal, wit;
    public PNB(double minInt, double minBal, double minWit){
        super.minInt=minInt;
        super.minBal=minBal;
        super.minWit=minWit;
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
        SBI s = new SBI(5, 5000, 1000);
        s.setBal(deposit_amt);
        s.calInterest(months);
        s.withdrawl(withdrawl_amt);
        
    }
    
    if(accType.equals("ICICI")){
        ICICI i = new ICICI(6, 5000, 1000);
        i.setBal(deposit_amt);
        i.calInterest(months);
        i.withdrawl(withdrawl_amt);
        
    }
    
    if(accType.equals("PNB")){
        PNB p = new PNB(7, 5000, 1000);
        p.setBal(deposit_amt);
        p.calInterest(months);
        p.withdrawl(withdrawl_amt);
        
    }
    }
    
    
    
}

public class BanksDriver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bankName, name;
        int id, months;
        double deposit_amt, withdrawl_amt;
        System.out.println("Enter Customer Name");
        name = sc.nextLine();
        System.out.println("Enter Bank Name");
        bankName = sc.nextLine();
        System.out.println("Enter Customer Id");
        id = sc.nextInt();
        System.out.println("Enter Deposit Amount");
        deposit_amt = sc.nextDouble();
        System.out.println("Enter number of months");
        months = sc.nextInt();
        System.out.println("Enter withdrawl amount");
        withdrawl_amt = sc.nextDouble();
        
        Customer c = new Customer(name, id, bankName, deposit_amt, months, withdrawl_amt);
    }
}