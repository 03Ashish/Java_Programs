class Student{
    private String First_name;
    private String Last_name;
    private String Major;
    private int Year;

    public String getFirst_name() {
        return First_name;
    }
    public String getLast_name() {
        return Last_name;
    }
    public String getMajor() {
        return Major;
    }
    public int getYear() {
        return Year;
    }
    public void setFirst_name(String first_name) {
        this.First_name = First_name;
    }public void setLast_name(String last_name) {
        this.Last_name = Last_name;
    }public void setMajor(String major) {
        this.Major = Major;
    }public void setYear(int year) {
        this.Year = Year;
    }

}
public class Student1{
    public static void main(String[] args) {
        Student s1=new Student();
       

        String First_name=s1.getFirst_name();
        String Last_name=s1.getLast_name();
        String Major=s1.getMajor();
        int Year=s1.getYear();
   
        System.out.println("Ashish");
        System.out.println("solunke");
        System.out.println("mechanical");
        System.out.println("4");
    }
}