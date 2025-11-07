import java.util.Scanner;
public class Addition{
   public static void main(String ...args){

     int a,b;
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter 2 Numbers:");
     a=sc.nextInt();
     b=sc.nextInt();

    System.out.println("Addition is:"+ (a+b));
  
   } 
}