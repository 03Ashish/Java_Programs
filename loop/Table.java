/*print Table of 5 using loop*/

import java.util.*;
class Table{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int a,b,i;
System.out.println("Enter a number");
a=sc.nextInt();
for(i=1;i<=10;i++){
b=a*i;
System.out.println(b);
}
}
}

