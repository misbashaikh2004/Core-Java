import java.util.Scanner;
 
 class Student{
      int roll; 
      String name;    
      float marks;
  }

 public class TestStudent{
    public static void main(String[] args){
        
     Scanner sc=new Scanner(System.in);

     Student s= new Student();
     
     System.out.println("Enter Student Details:");
     System.out.println("Roll No:");
     s.roll=sc.nextInt();

     System.out.println("Enter name:");
     s.name=sc.next();

     System.out.println("Enter Marks:");
     s.marks=sc.nextFloat();

     System.out.println("Given Data is:\n");
     System.out.println("Roll No:"+s.roll);
     System.out.println("Name:"+s.name);
     System.out.println("Marks:"+s.marks);
  }
}



     
