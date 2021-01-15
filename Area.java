import java.io.*;
import java.util.Scanner;
public class Area
{
	int length,breadth,area;
	public Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;	
		area=length*breadth;
	}
	int returnArea()
	{
		return area;
	}
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the rectangle:");
		int length=sc.nextInt();
		System.out.print("Enter the breadth of the rectangle:");
		int breadth=sc.nextInt();
		Area obj=new Area(length,breadth);
		System.out.println("Area of the rectangle is "+obj.returnArea());
	}
}