import java.util.Scanner;
import java.util.Arrays;
public class ArrayNew{
    public static void main(String[] args){
      
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number:");
        n = sc.nextInt();

        int[] a=new int[n];
        accept(a);

    while(true){
          System.out.println("""
                 1.Display
                 2.Max 
                 3.Min  
                 4.Search 
                 5.Occurence
                 6.Exit
                 Enter Choice:
                 """);
          int ch =sc.nextInt();

    switch(ch){
              case 1->display(a);

              case 2->System.out.println("Max:"+max(a));

              case 3->System.out.println("Min:"+min(a));
                
              case 4->{
                    System.out.println("Enter a Number For Search:");
                     int key=sc.nextInt();  
                     
                    if(search(a,key))
                       System.out.println("FOUND!!");
                    else
                       System.out.println("NOT FOUND!!");
                    }
                   
               case 5->{
                     System.out.println("Enter a Number For search:");
                     int key = sc.nextInt();
 
                     int cnt=occurence(a,key);
                     if(cnt == 0)
                       System.out.println("NOT FOUND!!");
                     else
                        System.out.println("FOUND");
                     }

                 case 6->
                       System.exit(0);
                      default->System.out.println("INVALID CHOICE!!");

                }
         }
  }
                  public static void accept(int a[]){
                    Scanner sc = new Scanner(System.in);
                    
                    for(int i=0;i<a.length;i++)
                       a[i] = sc.nextInt();
                   }

                  public static void display(int a[]){
                     Arrays.stream(a).forEach(System.out::println);
                   }
                 
                  public static int max(int a[]){
                      int max = Arrays.stream(a).max().getAsInt();
                      return max;
                  }

                  public static int min(int a[]){
                      int min = Arrays.stream(a).min().getAsInt();
                      return min;
                  }

                  public static boolean search(int a[],int key){
                         for(int x : a){
                           if(key == x)
                              return true;
                       }
                          return false;
                     }
              
                 public static int occurence(int a[],int key){
		    int cnt=0;

		for (int x : a) {
			if(key == x)
			  cnt++;
		}
		  return cnt;
	}

}













   
                   





                    












