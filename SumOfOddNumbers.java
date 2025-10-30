import java.util.Scanner;
public class SumOfOddNumbers{
   public static void main(String[] args){

       int n;
       Scanner sc=new Scanner(System.in);

        System.out. print("Enter n:");
        n=sc.nextInt();

        for(int i=0;i<=n;i=i+2){
           System.out.print(i + " ");
         }
      }
 }

