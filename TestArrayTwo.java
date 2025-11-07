import java.util.Scanner;
public class TestArrayTwo{

  public static void main(String[] args){
   
     int n;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a N:");
     n = sc.nextInt();

     int[] a = new int[n];
 
     accept(a);
     System.out.println("Given Data is:");
     display(a);
    }
 
     public static void accept(int a[]) {
       Scanner sc = new Scanner(System.in);

       for(int i=0;i<a.length;i++) {
           a[i] = sc.nextInt();
 
        }   
    }

     public static void display(int a[]){
         for(int x: a){
              System.out.println(x);
     }
       //System.out.println("length is:"+a.length);
   }
}
  

        