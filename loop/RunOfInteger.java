/*Exercise 1- Run of Integers
Write a program that asks the user for a starting value and an ending value and then writes all the 
integers (inclusive) between those two values. 
Enter Start:
5
Enter End:
9
5
6
7
8
9
*/

import java.util.*;
public class RunOfInteger{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("Enter start");
i=sc.nextInt();
System.out.println("Enter End");
j=sc.nextInt();
for(i=5;i<=9;i++)
{System.out.println("number between two value is "+i);
}
}
}