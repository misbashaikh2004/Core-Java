import java.util.Scanner;
public class Problem{
  public static void main(String[] args){

    int sum=0,i,n;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter n");
    n=sc.nextInt();
    int a[]=new int[n];


    for(i=0;i<a.length;i++)
    a[i]=sc.nextInt();

    for(int x : a){
       sum=sum+x;
    }
      System.out.println("sum is:"+sum);

   }
}