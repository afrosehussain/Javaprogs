//Accessing created package
import Restaurant.Menu;
import Restaurant.Bill;
import java.util.*;

public class NewCustomer{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        Menu m = new Menu();
        Bill b = new Bill();
        m.getMenu();
        b.askCustomer();
        b.finalBill();
        b.display(name);
    }
}