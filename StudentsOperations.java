import java.util.Scanner;

class Student{
   int roll;
   String name;
   float marks;
}

public class StudentsOperations{
   public static void main(String[] args){
	
	Student s[] = new Student[100];
 	int n = 0,loc;
	String name;
	
	Scanner sc  = new Scanner(System.in);
	
	
	 while(true){
          System.out.println("""
                 1.Add
                 2.Display 
                 3.Max By Marks
                 4.Min By Marks
                 5.Search By name
                 6.Exit
                 Enter Choice:
                 """);
          int ch =sc.nextInt();
	
			switch(ch){
			    case 1:s[n] = add();
			    	    n++;
				    break;


			    case 2:for(int i=0;i<n;i++)
				    display(s[i]);
				    break;

			    case 3:
				   max(s,n);
				   break;

			   case 4:
				  min(s,n);
				  break;

			   case 5:System.out.println("Enter a Name:");
				  sc.nextLine();
				  name=sc.nextLine();
				  loc=search(s,n,name);
				if(loc == -1)
				   System.out.println("NOT FOUND!!");
				else
				    display(s[loc]);
					break; 

			    case 6:
				  System.exit(0);
 				
                            default:
				  System.out.println("INVALID CHOICE");
   			}
		}
	}

  public static Student add(){
	Scanner sc = new Scanner(System.in);

	Student temp = new Student();

   	System.out.println("Enter Student Details:");
	System.out.println("Roll No:");
 	temp.roll = sc.nextInt();
	System.out.println("Name:");
	sc.nextLine();
	temp.name = sc.nextLine();
 	System.out.println("Marks:");
	temp.marks = sc.nextFloat();

	return temp;
	}

 public static void display(Student s){
	System.out.println("\nRoll Number :"+s.roll);
	System.out.println("Name   :"+s.name);
	System.out.println("Marks  :"+s.marks);
 	}

 public static void max(Student s[],int n){
	float maxMarks=s[0].marks;

	for(int i=1;i<n;i++){
	    if(maxMarks < s[i].marks)
		maxMarks = s[i].marks;
	}

	for(int i=1;i<n;i++){
	    if(maxMarks == s[i].marks)
		display(s[i]);
	}
 }


public static void min(Student s[],int n){
   	float minMarks=s[0].marks;

	for(int i=1;i<n;i++){
	   if(minMarks >s[i].marks)
		minMarks= s[i].marks;
	}
	

	for(int i=0;i<n;i++){
	   if(minMarks ==s[i].marks)
		display(s[i]);
	}
   }


public static int search(Student s[],int n,String name){
	
	for(int i=0;i<n;i++){
	    if(s[i].name.equalsIgnoreCase(name))
		return i;
	}
		return -1;
   }

}


//169java11
	



 							






