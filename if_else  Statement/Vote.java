/*Ask the user he/she is cast a vote*/
import java.util.*;
public class Vote{
public static void main(String[] args){
int age;
Scanner sc=new Scanner (System.in);
System.out.println("Enter your age");
age=sc.nextInt();
if(age>=18){
System.out.println("You can cast a vote");
}else{
System.out.println("You can not cast a vote");
}
}
}