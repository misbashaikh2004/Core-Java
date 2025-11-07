//20. Write a program to check whether given character is a digit or a character in lowercase or uppercase alphabet. (Hint ASCII value of digit is //between 48 to 58 and Lowercase characters have ASCII values in the range of 97 to122, uppercase is between 65 and 90)

import java.util.Scanner;

public class ASCII{
   public static void main(String[] args){
  
   char ch;
   Scanner sc=new Scanner(System.in);
     
    System.out.println("Enter a Anything");
    ch=sc.next().charAt(0);

    if((ch >=65 && ch <=90) || (ch >=97 && ch<=122))
       System.out.println("Alphabet");
    
    else if(ch >=48 && ch <=57)
        System.out.println("Digits");
    
    else
         System.out.println("Special Symbol");
     }
 }