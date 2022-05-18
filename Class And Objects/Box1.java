/*Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write 
suitable constructors to initialize them. Add functions like “getVolume” and “getArea” that will 
return volume and surface area respectively. Create object of boxes and then print their volume 
and surface area. 
*/
class Box{
    private int H;
    private int W;
    private int B;
    private int volume;
    private int Area;

    Box(){
        H=60;W=50;B=80;
        volume=(H*W*B);
        Area=(2*(B*W+B*H+H*W));
    System.out.println("enter the height,width,breadth");
    }
    void showData(){
        System.out.println("height"+H);
        System.out.println("width"+W);
        System.out.println("Breadth "+B);
        System.out.println("Volume "+volume);
        System.out.println("Area"+Area);

    }
}
public class Box1{
public static void main(String[] args) {
    Box b1=new Box();
    b1.showData();
}
}