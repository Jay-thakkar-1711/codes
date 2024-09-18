import java.util.*;
class Trinagle
{
	double l=3,b=4,h=5;
	public void data()
	{
		System.out.println("Perimeter of Trinagle is : "+(l+b+h));
		System.out.println("Area of Triangle is : "+(0.5*b*h));
	}
}
public class A25
{
	public static void main(String[] args) {
		Trinagle t = new Trinagle();
		t.data();
	}
}