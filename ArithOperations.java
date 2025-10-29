import java.util.Scanner;
public class ArithOperations{
 public static void main(String[] args){
   int a,b;
   Scanner sc=new Scanner(System.in);

   System.out.println("Enter a Number");
   a=sc.nextInt();
   b=sc.nextInt();
   
  System.out.println("Addition is :"+(a+b));
  System.out.println("Subtraction is :"+(a-b));
  System.out.println("Multiplication is :"+(a*b));
  System.out.println("Division is :"+(a/b));
  }
}



  