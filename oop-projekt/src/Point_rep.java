// 
import java.awt.*;

public class Point_rep
{
	public static void main(String[] arg) 
	{
	   Point p;
           p = new Point();
           
           int a;
           
           a = p.x;
           
           System.out.println("a: " +a);
           
           System.out.println("x-koordinant: "+p.x);
           System.out.println("y-koordinant: "+p.y);
           
           p.x = 110;
           p.y = 210;
           
           System.out.println("x-koordinant: "+p.x);
           System.out.println("y-koordiant: "+p.y);
           
           p.move(200,300);
           
           System.out.println("x-koordinant: "+p.x);
           System.out.println("y-koordinant: "+p.y);
           
           p.x = p.x+5;
           
           System.out.println("x-koordinant: "+p.x);
           System.out.println("y-koordinant: "+p.y);
           
           p.translate(-10,20);
           
           System.out.println("x-koordinant: "+p.x);
           System.out.println("y-koordinant: "+p.y);
           
                   
                   
           
                   
            
           
 
	}
}


