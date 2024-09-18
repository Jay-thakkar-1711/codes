import java.util.*;
abstract class Parent
{
	abstract void message();
}
class child1 extends Parent
{
	void message()
	{
		System.out.println("This is first subclass");
	}
}
class child2 extends Parent
{
	void message()
	{
		System.out.println("This is second subclass");
	}
}
public class A27
{
	public static void main(String[] args) {
		child1 c1=new child1();
		child2 c2=new child2();
		c1.message();
		c2.message();
	}
}