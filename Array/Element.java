/*1. Write a program   to store elements in an array and print it. 
Test Data : 
Input 10 elements in the array : 
element - 0 : 1 
element - 1 : 1 
element - 2 : 2 
....... 
Expected Output : 
Elements in array are: 1 1 2 3 4 5 6 7 8 9 
*/
import java.util.*;
public class Element{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int []arr=new int[9];
System.out.println("enter array items");
int i;
for(i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
System.out.println("Your array");
}
}