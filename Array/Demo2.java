

class Student{
   String firstname;
   public String getFirst() {
       return first;
   }
   String lastname;
   public String getLast() {
       return last;
   }
   int classyear;
   public int getclass(){
       return class;
   }
   String domain;
   public String getDomain() {
       return domain;
   }

}

public class Demo2 {
    public static void main(String[] args) {
    Student s1=new Student();
    s1.setfirst (Ashish);
    s1.setlast (solunke);
    s1.setclass (3);
    s1.setdomain(mechanical);
    System.out.println(s1.setfirst());
 System.out.println( s1.setlast());
 System.out.println(s1.setclass());
System.out.println(s1.setdomain());

        
    }
}
