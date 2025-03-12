import java.util.Scanner;
class Box{
    float Height;
    float width;
    float breath;
    Box( float Height,float width, float breath){
        this.Height=Height;
        this.breath=breath;
        this.width=width;
    }
  public double volume()
    {
        return Height*breath*width;
    }
}

public class calculate_volume {
    public static void main(String[] args) {

        Box b1=new Box(12,15,18);
        double volume1=b1.volume();
        System.out.println("Volume of Box1 is:"+volume1);
        Box b2=new Box(23,34,25);
        double volume2= b2.volume();
        System.out.println("Volume of Box2 is:"+volume2);
    }
}
