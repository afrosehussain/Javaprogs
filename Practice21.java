//a Java program to implement method overloading and method overriding
/**********************************************
*Lab session number      : 08
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 27/01/2021
*Program name            : Practice21.java
*Topics                  : Method overloading, Method Overriding, late/Dynamic/Run-time binding,  
                           Early/Static/Compile-time binding, Polymorphism
************************************************/

//imporing packages
import java.lang.*;
import java.util.*;

class IPLcricket{
    public void played_matches(){
        System.out.println("Team Summary:");
        System.out.print("Played Matches: ");
    }
    
    public void won(){
        System.out.print("Won: ");
    }
    
    public void loss(){
        System.out.print("Loss: ");
    }
}

class Hyderabad_sunrises extends IPLcricket{
    int win,loss,play;
    
    public Hyderabad_sunrises(){
        win=0;
        loss=0;
        play=0;
        System.out.print("Hyderabad_sunrises ");
    }

    public void played_matches(int hp){
        super.played_matches();
        play=hp;
        System.out.println(play);
    }
    
    public void won(int hw){
        super.won();
        win=hw;
        System.out.println(win);
    }
    
    public void loss(int hl){
        super.loss();
        loss=hl;
        System.out.println(loss);
    }
}

class Chennai_superkings extends IPLcricket{
    int win,loss,play;
    
    public Chennai_superkings(){
        win=0;
        loss=0;
        play=0;
        System.out.print("Chennai_superkings ");
    }
    
    public void played_matches(int cp){
        super.played_matches();
        play=cp;
        System.out.println(play);
    }
    
    public void won(int cw){
        super.won();
        win=cw;
        System.out.println(win);
    }
    
    public void loss(int cl){
        super.loss();
        loss=cl;
        System.out.println(loss);
    }
}

public class Practice21{
    public static void main(String...args){
        int hp,hw,hl,cp,cw,cl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of matches, won, lost of both teams: ");
        String data = sc.nextLine();
        String temp[]=data.split(",");
        hp=Integer.parseInt(temp[0]);
        hw=Integer.parseInt(temp[1]);
        hl=Integer.parseInt(temp[2]);
        cp=Integer.parseInt(temp[3]);
        cw=Integer.parseInt(temp[4]);
        cl=Integer.parseInt(temp[5]);
        Hyderabad_sunrises h1 = new Hyderabad_sunrises();
        if(hw+hl==hp){
            h1.played_matches(hp);
            h1.won(hw);
            h1.loss(hl);
        } else{
            System.out.println("Invalid Win and Loss data");
        }
        
       Chennai_superkings c1 = new Chennai_superkings();
        if(cw+cl==cp){
            c1.played_matches(cp);
            c1.won(cw);
            c1.loss(cl);
        } else{
            System.out.println("Invalid Win and Loss data");
        }
    }
}