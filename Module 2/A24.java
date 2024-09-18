import java.util.*;
class Rectangle
{
	private int l,b;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle is : "+(2*(l+b)));
	}
	public void area()
	{
		System.out.println("Area of Rectangle is : "+(l*b));
	}
}
class Square extends Rectangle
{
	private int s;
	public Square(int s)
	{
		super(s,s);
		this.s=s;
	}
	
	public void perimeter()
	{

	super.perimeter();
	super.area();
		System.out.println("Perimeter of Square is : "+(4*s));
	}
	public void area()
	{
		System.out.println("Area of Square is : "+(s*s));
	}
}
public class A24
{
	public static void main(String[] args) {
		Square s = new Square(10);
		s.perimeter();
		s.area();
	}
}