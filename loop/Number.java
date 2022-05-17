/*Write a program to take number from user into a variable and print all the numbers betn 1 to n*/

import java.util.*;
class Number{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int n,i;
n=sc.nextInt();
i=1;
while(i<=n){
System.out.println(i);
i=i+1;
}
}
}