/*Write a program to implement a class “student” with the following members. Name of the 
student. Marks of the student obtained in three subjects. Function to assign initial values. 
Function to compute total average. Function to display the student’s name and the total marks. 
Write an appropriate main() function to demonstrate the functioning of the above
*/
import java.util.Scanner;
class Student {
    private String fname;
    private int En;
    private int Ma;
    private int Sci;
    private int total;
    private int Average;
    Student(){
        fname="ashish";
        En=30;
        Ma=20;
        Sci=70;
          total=(En+Ma+Sci);
        Average=((En+Ma+Sci)/3);
        System.out.println("total marks");
    }
    void showData(){
        System.out.println("name "+fname);
        System.out.println("English marks "+En);
        System.out.println("Math marks "+Ma);
        System.out.println("Science marks "+Sci);
            System.out.println("Total "+total);
        System.out.println(("Average "+Average));
    }
}
public class Students{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.showData();
        s2.showData();
        
}
}
