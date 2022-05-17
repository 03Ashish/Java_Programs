/*Exercise 2 — Sum of Sequential Integers
Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and 
N. 
Enter N:
10
Sum = 55 */

import java.util.*;
public class Sum{
public static void main(String[] args){
Scanner sc= new Scanner (System.in);
int N,i;
int sum=0;
System.out.println("Enter N ");
N=sc.nextInt();
for (i=0;i<=N;i++){
sum=sum+i;
System.out.println(""+sum);
}
}
}
