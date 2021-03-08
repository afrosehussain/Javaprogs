import java.util.*;




public class VotingEligibiltyException extends Exception
{
    VotingEligibiltyException(String message)
    {
        super(message);
    }
    
}

class Demo
{
    int age;
    public static void main(String[] args)
    {
        int n=0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter the no. of voters");
            n=sc.nextInt();
        }
        while(n<0 || n==0);
        
        Demo v[] = new Demo[n];
        for(int i=0;i<v.length;i++)
        {
            v[i] = new Demo();

        }
        int x=0;
        for(int j=0;j<v.length;j++)
        {
            System.out.println("Enter voter age: ["+ ++x +"]");
            v[j].age=sc.nextInt();
            String message = check(v[j].age);
            System.out.println(message);
        }
    }
    public static String check(int age)
    {
        try
        {
            if(age<18)
            {
                throw new VotingEligibiltyException("You are under age");
            }
            else
            {
                return "Your Voting Card is issued";
            }
        }
        catch(VotingEligibiltyException e)
        {
            e.printStackTrace(); //predefined method in exception which prints in which line the error has occured
        }
        return "Thank You !";

    }
}