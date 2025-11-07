import java.util.Scanner;
public class Control{
 
  public static void main(String[] args){

     String expression;
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter a Expression:");
     expression = sc.nextLine();

     int a = Integer.parseInt(expression.split(" ")[0]);
     int b = Integer.parseInt(expression.split(" ")[2]);

     switch(expression.split(" ")[1]){
     case "+" -> System.out.println(expression+ "=" +(a+b));

     case "-" -> System.out.println(expression+ "=" +(a-b));
   
     case "*" -> System.out.println(expression+ "=" +(a*b));

     case "/" -> System.out.println(expression+ "=" +(a/b));

     default -> System.out.println("INVALID");
     }
  }
}