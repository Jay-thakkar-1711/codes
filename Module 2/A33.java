import java.util.*;
class Shape
{
	public void print()
	{
		System.out.println("This is a shape");
	}
}
class Rectangle extends Shape
{
	public void data()
	{
		System.out.println("This is a Rectangle");
	}
}
class Circle extends Shape
{
	public void data1()
	{
		System.out.println("This is Circle");
	}
}
class Square extends Rectangle
{

	public void print1()
	{
		System.out.println("Square is a Rectangle");
	}
}
public class A33
{
	public static void main(String[] args) 
	{
		Square s = new Square();
		System.out.println("Calling method of Square class ");
		s.print1();
		System.out.println("Calling method of Rectangle class by object of Square class");
		s.data();
		System.out.println("Calling method of Shape class by object Square class");
		s.print();
	}
}