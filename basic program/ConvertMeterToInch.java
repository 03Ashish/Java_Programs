

/*Write a Program to Convert meter to Feet and Inches
1 meter=12 inches
1 meter=100 centimeters
1 meter= 3.28084 Feet*/

import java.util.*;
class ConvertMeterToInch{
public static void main(String[]args)
{
int a;
float inch,centimeter,feet;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
inch=a*12;
System.out.println(a+" Meter = "+inch+" inches");
centimeter=a*100;
System.out.println(a+"Meter = "+centimeter+"centimeter");
feet=3.28F*a;
System.out.println(a+"Meter= "+feet+"feet");
}
}
