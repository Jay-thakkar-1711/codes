import java.io.*;
class A36
{
	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=30/0;
			//a[5]=30;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Division by 0 is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is greater than size");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}