/*Write a Program to take 3 digit number from user and print addition of its digits;*/
import java.util.*;
class Addition{
public static void main(String[]args){
int a,b,c;
int d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=a+b+c;
System.out.println("Addition of three numbers "+d);
}
}
