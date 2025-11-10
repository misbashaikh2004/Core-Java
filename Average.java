import java.util.Scanner;
public class Average{
  public static void main(String[] args){

    int a,b;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter n");
    a=sc.nextInt();
    b=sc.nextInt();
    average(a,b);
  }
  
     public static void average(int a,int b){
      int average= (a+b)/2;
      System.out.println("Average is "+average);

   }
}    
  
    
