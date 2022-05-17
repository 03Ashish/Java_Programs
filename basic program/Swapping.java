/*Write a Program to swap the content of two variable*/
import java.util.*;
public class Swapping {
 
    public static void main(String[] args)
    {
 
        int x = 100, y = 200;
        int z = x;
        x = y;
        y = z;
 
        System.out.println(" swapping ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}