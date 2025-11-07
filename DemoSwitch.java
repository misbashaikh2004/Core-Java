public class DemoSwitch{
  public static void main(String[] args){

     int ch;
     int a,b;

     java.util.Scanner sc = new java.util.Scanner(System.in);

     while(true){

        System.out.println("""
           1.Max
           2.Min 
           3.Equal 
           4.Addition
           5.Subtraction 
           6.Multiplication 
           7.Division 
           8.Exit 
           Enter a Choice:
           """);
        ch = sc.nextInt();

        System.out.println("Enter 2 Numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        switch(ch){
        case 1 ->{
              if(a > b)
                  System.out.println("Max is :"+a);
              else
                  System.out.println("Max is :"+b);
               }
         case 2 ->{
                if(a < b)
                  System.out.println("Min is :"+a);
              else
                  System.out.println("Min is :"+b);
               }

         case 3 ->{
                if(a == b)
                  System.out.println(a +" "+ "Equal to :"+a);
              else
                  System.out.println(a +" "+ "Not Equal to :"+b);
               }

         case 4 ->{
                 int c = a + b;
                 System.out.println("Addition is : " + c);
               }
 
         case 5 ->{
                 int c = a - b;
                 System.out.println("Subtraction is : " + c);
               }
      
         case 6 ->{
                 int c = a * b;
                 System.out.println("Multiplication is : " + c);
               }

          case 7 ->{
                 int c = a / b;
                 System.out.println("Division is : " + c);
               }


     

        }
     }
  }
}
     

