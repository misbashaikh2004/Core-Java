//2. Write a program to check whether given number is positive or negative? 

import java.util.Scanner;

public class PositiveNegative{
   public static void main(String[] args){
   
    int n;
    Scanner sc=new Scanner(System.in);
   
    System.out.println("Enter a Number");
    n=sc.nextInt();
    
    if(n>0)
       System.out.println("Positive");
     
    else
        System.out.println("Negative");
     }
}
