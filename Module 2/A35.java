import java.io.*;
import java.util.*;
class A35
{
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int res=a/b;
			System.out.println("Result is : "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 is not possible");
		}
	}
}