import java.util.*;
class parent
{
	public void print()
	{
		System.out.println("This is a parent class");
	}
}
class child extends parent
{
	public void data()
	{
		System.out.println("This is a child class");
	}
}
public class A22
{
	public static void main(String[] args) {
		parent p=new parent();
		child c=new child();
		System.out.println("Calling the method of parent class by the object of parent class");
		p.print();
		System.out.println("Calling the method of child class by the object of child class");
		c.data();
		System.out.println("Calling the method of both parent and child class by the object of child class");
		c.print();
		c.data();
	}
}