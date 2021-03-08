//Access a Package
import Placements.No_Of_Placements;
import java.util.Scanner;

public class Practice15{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        
        No_Of_Placements n[] = new No_Of_Placements[years];
        for(int i=0;i<years;i++){
            n[i] = new No_Of_Placements();
            n[i].readData();
        }
        int total=0;
        for(int j=0;j<years;j++){
            total+=n[j].placements;
        }
        
        System.out.println("Total No.of placements: "+total);
    }
}