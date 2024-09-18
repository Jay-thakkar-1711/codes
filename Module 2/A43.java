import java.io.*;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread 1");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Thread 2");
	}
}
public class A43
{
	public static void main(String[] args) {
		try
		{
			Thread1 t1=new Thread1();
			Thread2 t2=new Thread2();
			t1.start();
			t1.setDaemon(true);
			t2.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}