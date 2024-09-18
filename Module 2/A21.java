import java.util.*;
class Calc
{
	public void area(int l)
	{
		System.out.println("Area of square is : "+(l*l));
	}
	public void area(int l,int b)
	{
		System.out.println("Area of rectangle is : "+(l*b));
	}
}
public class A21
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the breadth");
		int b=sc.nextInt();
		Calc c=new Calc();
		c.area(l);
		c.area(l,b);
	}
}