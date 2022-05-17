/* Exercise 4 — Repeatedly Echo a Word
Write a program that asks the user to enter a word. The program will then repeat word for as 
many times as it has characters: 
Enter a word:
Hello
Hello
Hello
Hello
Hello
Hello */

import java.util.*;
public class RepeatedlyWord{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i;
System.out.println("Enter a Number");
i=sc.nextInt();
for(i=1;i<=5;i++){
System.out.println("Hello");}
}
}