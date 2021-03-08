import java.io.*;

public class ReadFile{
    
    public static void main(String...args){
        FileReader r=null;
        File f = new File("input.txt");
        try{
            r = new FileReader(f);
            int i=0;
            while((i=r.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File is not found!");
        }
        catch(IOException e){
            System.out.println("Not able to read!");
        }
        finally{
            try{
                r.close();
            }
            catch(IOException e){
                System.out.println("Not responding");
            }
        }
    }
}