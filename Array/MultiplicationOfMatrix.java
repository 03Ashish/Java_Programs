import java.util.*;
public class MultiplicationOfMatrix{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int i,j;
int arr1[][]=new int[3][3];
int arr2[][]=new int[3][3];
int arr3[][]=new int[3][3];
System.out.println("enter the first matrix");
for (i=0;i<3;i++){
  for(j=0;j<3;j++){
  arr1[i][j]=sc.nextInt();
  }
  }
  System.out.println("enter the second matrix");
for (i=0;i<3;i++){
  for(j=0;j<3;j++){
  arr2[i][j]=sc.nextInt();
  }
  }
  System.out.println("enter the third matrix");
for (i=0;i<3;i++){
  for(j=0;j<3;j++){
  arr3[i][j]=arr1[i][j]*arr2[i][j];
  }
  }
  System.out.println("enter the sum of  matrix");
for (i=0;i<3;i++){
  for(j=0;j<3;j++){
 System.out.println(arr3[i][j]+"");
 
  }
  System.out.println();
  }}
  }
  