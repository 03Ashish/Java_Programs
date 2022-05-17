/*Exercise 5 — Town Dump
The New Britain, Connecticut town dump charges you $20 to dispose of 200 pounds of trash. 
They charge $8 for each additional hundred pounds beyond the first 200. Write a program that 
asks for the weight of a load of trash and then calculates the charge.*/


 import java.util.*;
 class TownDump
{
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
               int trash,total,x;
        System.out.println("Enter the trash in kg : ");
        trash=sc.nextInt();
        total=20;
        trash=trash-200;
        if(trash>0)
        {x=trash/100;
        x=x*8;
        total=total+x;
}
System.out.println("total cost is "+total);
}
}