/*Write a Program to take 3 digit number from user and print its reverse number
• For example if user entered 352 number then output will be 253*/
import java.util.*;
	class ReverseNumber{
   public static void main(String []args){
   
		int num, temp,a,b,c,d;
      Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTER THE THREE DIGIT NUMBER ");
      num=sc.nextInt();

		System.out.println("AFTER REVERSE RESULT IS ");
		a = num/100;
	   System.out.println(a);
		b = num%100;
      System.out.println(b);
      c=b/10;
      System.out.println(c);
      d=b%10;
      System.out.println(d);
      
      temp=d*100+c*10+a;
 		System.out.println("reverse is "+temp);

}
	}