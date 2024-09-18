import java.util.*;
abstract class Marks
{
	abstract void getPercentage();
}
class A extends Marks
{
	private double m1,m2,m3;
	double per;
	public A(double m1,double m2,double m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void getPercentage()
	{
		per=((m1+m2+m3)*100)/300;
		System.out.println("Percentage of Student A is : "+per+" %");

	}
}
class B extends Marks
{
	private double m1,m2,m3,m4;
	double per;
	public B(double m1,double m2,double m3,double m4)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	public void getPercentage()
	{
		per=((m1+m2+m3+m4)*100)/400;
		System.out.println("Percentage of Student B is : "+per+" %");
	}
}
public class A29
{
	public static void main(String[] args) {
		A a1=new A(89,56,78.5);
		B b1=new B(79,98,56.5,48);
		a1.getPercentage();
		b1.getPercentage();
	}
}