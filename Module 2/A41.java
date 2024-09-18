import java.io.*;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread1 is running");
		
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Thread2 is running");
		
	}
}
public class A41
{
	public static void main(String[] args) {
		try
		{
			Thread1 t1=new Thread1();
			Thread2 t2 = new Thread2();
			t1.start();
			t1.sleep(2000);
			t2.start();
			t2.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}