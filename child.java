import java.io.*;
class parent
{
	void method1()
	{
		System.out.println("This is parent class");
	}
}
public class child extends parent
{
	void method2()
	{
		System.out.println("This is child class");
	}
	public static void main(String args[])
	{
		parent obj1=new parent();
		obj1.method1();
		child obj2=new child();
		obj2.method2();
		obj2.method1();
	}
}