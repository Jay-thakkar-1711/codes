import java.io.*;
class TestThreadTwice1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class A42
{
	public static void main(String[] args) {
		try
		{
			TestThreadTwice1 t1=new TestThreadTwice1();
			t1.start();
			t1.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}