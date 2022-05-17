/*Write a program that asks a user for their birth year encoded as two digits (like "62") and for the 
current year, also encoded as two digits (like "99"). The program is to correctly write out the 
users age in years. 
Year of Birth: 62
Current year: 99
Your age: 37*/


import java.util.Scanner;
  class CalculateTheAge{
public static void main(String[] args)
     {   int yob;
     int cy;
     int age;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the year of birth ");
         yob=sc.nextInt();
         System.out.println("enter the current age ");
         cy=sc.nextInt();
        if (cy<yob){
        yob=100-yob;
        age=yob+cy;
        System.out.println("Your age "+age);
        }
        else{
        age=cy-yob;
        System.out.println("age  be "+age);
        }
        }
        }