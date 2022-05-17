/*Exercise 2 — Last Chance Gas
Al's Last Chance Gas station sits on Route 190 on the edge of Death Valley. There is no other 
gas station for 200 miles. Write a program to help drivers decide if they need gas. The program 
asks for: 
• The capacity of the gas tank, in gallons.
• The indication of the gas gauge in percent (full= 100, three quarters full = 75, and so on).
• The miles per gallon of the car.
The program then writes out "Get Gas" or "Safe to Proceed" depending on if the car can cross 
the 200 miles with the gas remaining in the tank. 
Tank capacity:
12
Gage reading:
50
Miles per gallon:
30
Get Gas!
Use integers for all input and all arithmetic*/

import java.util.Scanner;
  class LastChanceGas
{ public static void main(String[] args)
     {   int tank; 
         int gauge; 
         int mpg;
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the tank capacity");
         System.out.println("Enter the gauge reading (in percent: 100/75/50/25)");
         System.out.println("Enter the miles per gallon");

          tank = scan.nextInt();
          gauge = scan.nextInt();
        mpg = scan.nextInt();
         if ( tank < 200) {
   System.out.print("Get gas");
}
}
}