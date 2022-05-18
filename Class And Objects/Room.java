/*Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three 
fields(variables). This class also has a method “volume()” to calculate the volume of this room.
*/
import java.util.*;
class Room1 {
    private int height;
    private int width;
    private int breadth;
 public int getBreadth() {
     return breadth;
 }public int getHeight() {
     return height;
 }public int getWidth() {
     return width;
 }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }public void setHeight(int height) {
        this.height = height;
    }public void setWidth(int width) {
        this.width = width;
    }
}
   class Room(){
    public static void main(String[] args) {
    Scanner ob =new Scanner(System.in);
        Room1 ob= new Room1();
        ob.setHeight(height("20"));
        ob.setBreadth(breadth:"30");
        ob.setWidth(width:"50");
        volume=height*width*breadth;
        System.out.println("volume");
        
        
        
    }
}
