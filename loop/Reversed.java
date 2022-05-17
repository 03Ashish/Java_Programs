/*Write a program that promotes the user to input a positive integer. and then outputs the number with the digits reversed.for example input is 12345 the output should be 54321*/
import java.util.*;
public class Reversed{
public static void main(String[]args){
int i;
int r=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
i=sc.nextInt();
int temp=i;
int remainder=0;
while(temp>0)
{
remainder=temp%10;
r=r*10+remainder;
temp/=10;
}
System.out.println("Reverse is "+r);
}
}
