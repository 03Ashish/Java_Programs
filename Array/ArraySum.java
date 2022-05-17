/*
Exercise 1 — Array Sum
Examine the following program:
class Exercise1
{
 public static void main ( String[] args )
 {
 int[] val = {0, 1, 2, 3};
 sum = System.out.println( "Sum of all numbers = " + sum );
 }
}
Complete the assignment statement so that it computes the sum of all the numbers in the array
*/
import java.util.*;
public class ArraySum{
public static void main(String[]args){
 int[] arr = {0, 1, 2, 3};
int sum = Arrays.stream(arr).sum(); 
System.out.println( "Sum of all numbers = " + sum );
 }
}
