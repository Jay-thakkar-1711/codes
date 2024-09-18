import java.util.*;
abstract class Square
{
	abstract void RectangleArea(int l,int b);
	abstract void SquareArea(int s);
	abstract void CircleArea(double r);
}
class Area extends Square
{
	void RectangleArea(int l,int b)
	{
		System.out.println("Area of rectangle is : "+(l*b));
	}
	void SquareArea(int s)
	{
		System.out.println("Area of Square is : "+(s*s));
	}
	void CircleArea(double r)
	{
		System.out.println("Area of circle is : "+(3.14*r*r));
	}
}
public class A31
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the side");
		int s= sc.nextInt();
		System.out.println("Enter the radius");
		double r=sc.nextDouble();
		Area a=new Area();
		a.RectangleArea(l,b);
		a.SquareArea(s);
		a.CircleArea(r);
	}
}