//Accessing created package
import Budget.State;
import java.util.*;

class AP implements State{
    double ap_revenue;
    public void setRevenue(double Revenue){
        ap_revenue=Revenue;
    }
    public double getRevenue(){
        return ap_revenue;
    }
}

class KA implements State{
    double ka_revenue;
    public void setRevenue(double Revenue){
        ka_revenue=Revenue;
    }
    public double getRevenue(){
        return ka_revenue;
    }
}

class TN implements State{
    double tn_revenue;
    public void setRevenue(double Revenue){
        tn_revenue=Revenue;
    }
    public double getRevenue(){
        return tn_revenue;
    }
}



public class CountryRevenue{
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter AP revenue: ");
        double ap = sc.nextDouble();
        System.out.print("Enter KA revenue: ");
        double ka = sc.nextDouble();
        System.out.print("Enter TN revenue: ");
        double tn = sc.nextDouble();
        AP a = new AP();
        a.setRevenue(ap);
        KA k = new KA();
        k.setRevenue(ka);
        TN t = new TN();
        t.setRevenue(tn);
        double total = a.ap_revenue+k.ka_revenue+t.tn_revenue;
        System.out.println("AP Revenue: "+a.getRevenue()+"%");
        System.out.println("KA Revenue: "+k.getRevenue()+"%");
        System.out.println("TN Revenue: "+t.getRevenue()+"%");
        System.out.println("Total Revenue of the Country: "+String.format("%.2f",total)+"%");
        if(total>0){
            System.out.println("Revenue Gained");
        } else{
             System.out.println("Revenue Loss");
        }
    }
}