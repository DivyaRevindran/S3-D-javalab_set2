import java.io.*;
import java.util.Scanner;                                                                                         
public class Area1
{
	public static void main(String args[])
	{
		System.out.print("Enter the radius of circle:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		Area1 obj=new Area1();
		obj.calculateArea(r);
		System.out.print("Enter the length and breadth of the rectangle:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		Area1 obj1=new Area1();
		obj1.calculateArea(l,b);
	}
	void calculateArea(int radius)
	{
		double Area=3.14*radius*radius;
		System.out.println("Area of circle is "+Area);
	}
	void calculateArea(int length,int breadth)
	{
		int Area=length*breadth;
		System.out.println("Area of rectangle is "+Area);
	}
}	