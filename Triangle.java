import java.io.*;
public class Triangle
{
	public Triangle()
	{
		int s1=3,s2=4,s3=5;
		int p=s1+s2+s3;
		int a=(s1*s2)/2;
		System.out.println("Perimeter of triangle with sides 3,4,5 units = "+p);
		System.out.println("Area of triangle with sides 3,4,5 units = "+a);
	}
	public static void main(String args[])
	{
		Triangle obj=new Triangle();
	}
}