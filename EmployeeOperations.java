import java.util.Scanner;

class Employee{
    int id;
    String name;
    float salary;
    float da;
    float hra;
    float tax;
    float basicSalary;
    float total_salary;
}

public class EmployeeOperations{
     public static void main(String[] args){

     Employee e[] = new Employee[100];
     int n = 0,loc;
     String name;
     
     Scanner sc = new Scanner(System.in);
    while(true){
          System.out.println("""
                 1.Add
                 2.Display 
                 3.Max By Salary
                 4.Min By Salary
                 5.Search By name
                 6.Exit
                 Enter Choice:
                 """);
          int ch =sc.nextInt();

     switch(ch){
		case 1:e[n]=add();
			n++;
			break;
		
 		case 2:for(int i=0;i<n;i++)
			display(e[i]);
			break;

		case 3:
			max(e,n);
			break;

		case 4:
			min(e,n);
			break;
   		case 5:
			System.out.println("Enter a Name:");
			sc.nextLine();
			name=sc.nextLine();
			loc=search(e,n,name);
			if(loc == -1)
			   System.out.println("NOT FOUND !!");
			else
			   display(e[loc]);
			   break;
   		case 6:
			System.exit(0);

   		default:System.out.println("INVALID CHOICE !!");

		}
	}
}

public static Employee add(){
	Scanner sc = new Scanner(System.in);
	Employee temp = new Employee();
        
	System.out.println("Enter  Employee Details:");
	System.out.println("ID:");
        temp.id = sc.nextInt();

        System.out.println("Name:");
	sc.nextLine();
	temp.name = sc.nextLine();

        System.out.println("Salary:");
	temp.basicSalary = sc.nextFloat();

       System.out.println("Enter DA:");
       temp.da=sc.nextFloat();

	System.out.println("Enter HRA:");
	temp.hra=sc.nextFloat();
	
	System.out.println("Enter Tax:");
	temp.tax=sc.nextFloat();

 	temp.total_salary = temp.basicSalary + (temp.basicSalary * (temp.da + temp.hra - temp.tax) / 100);

        	return temp;                                                      
	}

public static void display(Employee e){
	
  	System.out.println("Id:"+e.id);	
	System.out.println("Name:"+e.name);
	System.out.println("Salary:"+e.basicSalary);
	System.out.println("DA:"+e.da);
	System.out.println("HRA:"+e.hra);
	System.out.println("Tax:"+e.tax);
	System.out.println("Total Salary:"+e.total_salary);
        System.out.println("  ");
     	}

public static void max(Employee e[],int n){
	float maxsalary=e[0].basicSalary;

	for(int i=1;i<n;i++){
	    if(maxsalary < e[i].basicSalary)
		maxsalary = e[i].basicSalary;
	}

	for(int i=1;i<n;i++){
	    if(maxsalary == e[i].basicSalary)
		display(e[i]);
	}
 }


public static void min(Employee e[],int n){
   	float minsalary=e[0].basicSalary;

	for(int i=1;i<n;i++){
	   if(minsalary >e[i].basicSalary)
		minsalary= e[i].basicSalary;
	}
	

	for(int i=0;i<n;i++){
	   if(minsalary ==e[i].basicSalary)
		display(e[i]);
	}
   }


public static int search(Employee e[],int n,String name){
	
	for(int i=0;i<n;i++){
	    if(e[i].name.equalsIgnoreCase(name))
		return i;
	}
		return -1;
   }

}


	
	






