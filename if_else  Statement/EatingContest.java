/*At the State Fair Pie Eating Contest all contestants in the heavyweight division must weigh 
within 100 pounds and 250 pounds. Write a program that asks for a contestant's weight and then 
says if the contestant is allowed in the contest.*/


import java.util.Scanner;
  class EatingContest
{ public static void main(String[] args)
     {   int contestantweight;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the contestant weight ");
         contestantweight=sc.nextInt();
     if( contestantweight>=100 &&   contestantweight<=250){
        System.out.println("contestant is applicable for pie eating contest ");
        }
        else{
        System.out.println("contestant is not applicable for pie eating contest ");
        }
        }
        }