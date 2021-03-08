//Creating a package
package Restaurant;

import java.util.*;

public class Bill{
    Scanner sc = new Scanner(System.in);
    int one,two,three,four;
    double bill,tax;
    
    public void askCustomer(){
        System.out.print("\nNumber of First items you want: ");
        one = sc.nextInt();
        System.out.print("Number of Second items you want: ");
        two = sc.nextInt();
        System.out.print("Number of Third item you want: ");
        three = sc.nextInt();
        System.out.print("Number of Fourth item you want: ");
        four = sc.nextInt();
    }
    
    public void finalBill(){
        bill=(one*340)+(two*240)+(three*100)+(four*140);
        if(bill<=750){
            tax=5;
        } else{
            tax=8;
        }
         bill=bill+(bill*tax/100);
    }
    
    public void display(String name){
        System.out.println("Customer name: "+name);
        System.out.println("Tax percent: "+tax+"%");
        System.out.println("Total bill: "+bill);
    }
}
    