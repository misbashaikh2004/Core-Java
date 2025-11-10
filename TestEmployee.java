import java.util.Scanner;
  class Employee{
     int id;
     String name;
     float salary;
  }

public class TestEmployee{
   public static void main(String[] args){

      Scanner sc=new Scanner(System.in);
      Employee e= new Employee();

      System.out.println("Enter Employee Details:");
      System.out.println("Enter ID:");
      e.id=sc.nextInt();

      System.out.println("Enter Name:");
      e.name=sc.next();

      System.out.println("Enter Salary:");
      e.salary=sc.nextFloat();

      System.out.println("Given Data is:\n");
      System.out.println("ID:"+e.id);
      System.out.println("Name:"+e.name);
      System.out.println("Salary:"+e.salary);
   }
}



