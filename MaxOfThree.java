//12. Write a program to find maximum of three numbers? (3-4 logics) and (with conditional operator). Modify and find minimum of three numbers.

import java.util.Scanner;
public class MaxOfThree{
  public static void main(String[] args){
   
  int a,b,c;
  Scanner sc=new Scanner(System.in);

 System.out.println("Enter 3 Number");
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 
 if(a>=b && a>=c)
    System.out.println("Max is:"+a);
  
 else if(b>=a && b>=c)
    System.out.println("Max is:"+b);
  
 else
    System.out.println("Max is:"+c);
  }
}
