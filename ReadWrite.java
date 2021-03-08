import java.io.*;
public class ReadWrite{
    public static void main(String...args){
        try{
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.println("The current character is: "+(char)i);
                fout.write(i);
            }
            fin.close();
            fout.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}