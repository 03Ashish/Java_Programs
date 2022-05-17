/*Write a Program to calculate Gross Salary.
 In this program we will take basic salary as an input and on the basis of following calculations 
we calculate gross salary.
• da is 20% of basic salary
• hra is 40% of basic salary
• Gross Salary = basic salary + da + hra*/

class GrossSalary{
public static void main(String[]args){
        int sal = 8600;
        double da = 20 / 100.0 * sal;
        double hra = 10 / 100.0 * sal;
        double gross = sal + da + hra ;
        System.out.println("Gross Salary = " + gross);
    }
}
