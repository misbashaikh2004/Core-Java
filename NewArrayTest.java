import java.util.Scanner;

class Student{
   int roll;
   String name;
   float marks;
}

public class NewArrayTest{
   public static void main(String[] args){

    Scanner sc= new Scanner(System.in);

   System.out.println("Enter Number of Students:");
   int n=sc.nextInt();

   Student s[] = new Student[n];
   for(int i=0; i<s.length; i++){
       s[i] = new Student();

   System.out.println("Roll Number:");
   s[i].roll = sc.nextInt();

   System.out.println("Name:");
   sc.nextLine();
   s[i].name = sc.nextLine();

   System.out.println("Marks:");
   s[i].marks=sc.nextFloat();
  }

   for(Student x: s){
   System.out.println("\nRoll No:"+ x.roll);
   System.out.println("Name   :"+  x.name);
   System.out.println("Marks  :"+  x.marks);
   }
   }
 }



   






 

  