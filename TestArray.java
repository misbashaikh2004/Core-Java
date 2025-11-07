import java.util.Scanner;
public class TestArray{
   public static void main(String[] args){

     int n;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a N:");
     n = sc.nextInt();

     int a[]= new int[n];
     for(int i=0;i<a.length;i++)
       a[i]=sc.nextInt();
  
     System.out.println("Given Data is\n");

     for(int x : a)
     System.out.println(x);

   }
}