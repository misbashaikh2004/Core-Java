// #include<stdio.h>
// int main(){
//     int a;
//     printf("enter a no:\n");
//     scanf("%d",&a);
//     printf("*\n");
//      printf("* *\n");
//       printf("* * *\n");
//     printf("* * * *\n");
//         printf("* * * * *\n");
//         return 0;

// }

// import java.util.Scanner;
// public class Even{
//      public static void main(String[] args){
//         int n;
//         // Scanner sc=new Scanner(System.in);
//         System.out. print("Enter n:");
//          Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();

//         for(int i=0;i<=n;i=i+2){
//             System.out.print(i + " ");
//         }
//      }
// }

import java.util.Scanner;
public class Even{
     public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out. print("Enter n:");
        //  Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i=i+2){
            System.out.print(i + " ");
        }
     }
}