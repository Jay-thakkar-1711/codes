import java.util.*;
class Complex
{
	public void sum(int a,int b)
	{
		System.out.println("Sum is : "+(a+b));
	}
	public void difference(int a,int b)
	{
		System.out.println("Difference is : "+(a-b));
	}
	public void product(int a,int b)
	{
		System.out.println("Product is : "+(a*b));
	}
}
public class A26
{
	public static void main(String[] args) {
		Complex c=new Complex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		c.sum(a,b);
		c.difference(a,b);
		c.product(a,b);
	}
}