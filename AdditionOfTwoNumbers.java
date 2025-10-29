import java.util.Scanner;
public class AdditionOfTwoNumbers{
   public static void main(String[] args){
   
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter 2 Number");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;

   System.out.println("Addition is:"+c);
   
  }
}