import java.util.Scanner;
public class PrintOddNumbers{
   public static void main(String[] args){

       int n;
       Scanner sc=new Scanner(System.in);

        System.out. print("Enter n:");
        n=sc.nextInt();

        for(int i=1;i<=n;i=i+2){
           System.out.print(i + " ");
         }
      }
 }

