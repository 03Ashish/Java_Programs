/*Exercise 3 — Sum of a Range of Sequential Integers
Write a program that asks the user for two integers, low and high and then sums all the integers 
(inclusive) low through N. 
Enter low:
5
Enter high:
10
Sum = 45 */

import java.util.*;
public class RangeOfSequentialInteger{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int i,j;
int sum=0;
System.out.println("Enter start");
i=sc.nextInt();
System.out.println("Enter End");
j=sc.nextInt();
for(i=0;i<j;i++){
sum=sum+i;
System.out.println(" "+sum);
}
}
}