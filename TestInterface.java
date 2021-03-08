//a java program to implement interfaces
/**********************************************
*Lab session number      : 06
*Type of lab             : In Lab
*Problem No.             : 01
*Programmer              : Afrose Hussain
*Date                    : 03/02/2021
*Program name            : Number.java
*Topics                  : Implementation of Interfaces, interface, implements, defining an interface
************************************************/

//import the required packages
import java.lang.*;
import java.util.Scanner;

//Creating iterface
interface Number{
    public abstract boolean isZero();
    public abstract boolean isPositive();
    public abstract boolean isNegative();
    public abstract boolean isOdd();
    public abstract boolean isEven();
    public abstract boolean isPrime();
    public abstract boolean isArmstrong();
}

class Verification implements Number{
    int number;
    public Verification(int number){
        this.number=number;
    }
    
    public boolean isZero(){
        if(number==0){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean isPositive(){
        if(number>0){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean isNegative(){
        if(number<0){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean isEven(){
        if(number%2==0){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean isOdd(){
        if(number%2!=0){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean isPrime(){
        if(number>0){
            for(int i=2;i<number/2;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        } else{
            for(int i=2;i<-number/2;i++){
                if(-number%i==0){
                    return false;
                }
            }
            return true;
        }
        
    }
    
    public boolean isArmstrong(){
        int d,sum=0,n;
        n=number;
        if(n>0){
            while(n>0){
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
            }
            if(sum==number){
                return true;
            } else{
                return false;
            }
        } else{
            n=-n;
            while(n>0){
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
            }
            if(sum==-number){
                return true;
            } else{
                return false;
            }
        }
        
    }
}

class TestInterface{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Verification v = new Verification(number);
        boolean zero = v.isZero();
        boolean positive = v.isPositive();
        boolean negative = v.isNegative();
        boolean odd = v.isOdd();
        boolean even = v.isEven();
        boolean prime = v.isPrime();
        boolean armstrong = v.isArmstrong();
        
        if(zero){
            System.out.println("It is zero");
        } else if(positive){
            if(even){
                if(prime){
                    if(armstrong){
                        System.out.println("It is a positive, even, prime, armstrong number");
                    } else{
                        System.out.println("It is a positive, even, prime number");
                    }
                }else if(armstrong){
                    System.out.println("It is a positive, even, armstrong number");
                } else{
                    System.out.println("It is a positive, even number");
                }
            } else{
                if(prime){
                    if(armstrong){
                        System.out.println("It is a positive, odd, prime, armstrong number");
                    } else{
                        System.out.println("It is a positive, odd, prime number");
                    }
                }else if(armstrong){
                    System.out.println("It is a positive, odd, armstrong number");
                } else{
                    System.out.println("It is a positive, odd number");
                }
            }
        } else if(negative){
            if(even){
                if(prime){
                    if(armstrong){
                        System.out.println("It is a negative, even, prime, armstrong number");
                    } else{
                        System.out.println("It is a negative, even, prime number");
                    }
                }else if(armstrong){
                    System.out.println("It is a negative, even, armstrong number");
                } else{
                    System.out.println("It is a negative, even number");
                }
            } else{
                if(prime){
                    if(armstrong){
                        System.out.println("It is a negative, odd, prime, armstrong number");
                    } else{
                        System.out.println("It is a negative, odd, prime number");
                    }
                }else if(armstrong){
                    System.out.println("It is a negative, odd, armstrong number");
                } else{
                    System.out.println("It is a negative, odd number");
                }
            }
        }
    }
}