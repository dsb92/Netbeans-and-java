package kapitel_03;
import java.awt.*; // Point-klassen skal importeres fra pakken java.awt

public class BenytPunkter
{
	public static void main(String[] arg) 
	{
		Point p;
		p = new Point();

		int a;

		a = p.x;

		System.out.println("a: "+a);

		System.out.println("x-koordinat: "+p.x);
		System.out.println("y-koordinat: "+p.y);
                
                System.out.println();

		p.x = 110;
		p.y = 210;
		System.out.println("x-koordinat: "+p.x);
		System.out.println("y-koordinat: "+p.y);
                
                System.out.println();

		p.move(200,300);
		System.out.println("x-koordinat: "+p.x);
		System.out.println("y-koordinat: "+p.y);

                System.out.println();
                
		p.x = p.x + 5;
		System.out.println("x-koordinat: "+p.x);
		System.out.println("y-koordinat: "+p.y);
                
                System.out.println();

		p.translate(-10,20);
		System.out.println("x-koordinat: "+p.x);
		System.out.println("y-koordinat: "+p.y);
	}
}