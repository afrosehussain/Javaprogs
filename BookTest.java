//A Java program to create an array of object for 30 elements for class Book to demonstrate the class Book's capabilities.

/**********************************************
*Lab session number      : 02
*Type of lab             : In Lab
*Problem No.             : 02
*Programmer              : Afrose
*Date                    : 17/01/2021
*Program name            : BookTest.java
*Topics                  : Fundamentals of java programming
                           Variables, Data types, operators & Control Statements, arrays
************************************************/

//import required packages
import java.lang.*;
import java.util.*;

class Book{
    String bookName;
    int ISBN;
    String author;
    String publisher;
    Scanner sc = new Scanner(System.in);
    //no parameterised constructor
    public Book(){
        bookName="unknown";
        ISBN=0;
        author="unknown";
        publisher="unknown";
    }
    
    public String getBookName(){
        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();
        return book;
    }
    public int getISBN(){
        System.out.print("Enter ISBN Number: ");
        int isbn = sc.nextInt();
        return isbn;
    }
    public String getAuthorName(){
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();
        return authorName;
    }
    public String getPublisherName(){
        System.out.print("Enter Publisher Name: ");
        String publisherName = sc.nextLine();
        return publisherName;
    }
    
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public void setAuthorName(String author){
        this.author = author;
    }
    public void setPublisherName(String publisher){
        this.publisher = publisher;
    }
    
    public String getBookInfo(){
        return (bookName+", which has the ISBN number "+ISBN+" was written by "+author+" and published by "+publisher);
    }
}


public class BookTest{
    public static void main(String args[]){
        Book[] b = new Book[30];
	    b[0] = new Book();
        b[0].setBookName(b[0].getBookName());
        b[0].setAuthorName(b[0].getAuthorName());
        b[0].setPublisherName(b[0].getPublisherName());
        b[0].setISBN(b[0].getISBN());
        System.out.println(b[0].getBookInfo());
}
}