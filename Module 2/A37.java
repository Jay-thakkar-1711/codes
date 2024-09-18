import java.io.*;
import java.util.*;
class A37
{
	public static void main(String[] args) throws ArithmeticException{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age");
			int age=sc.nextInt();
			if(age>=18)
			{
				System.out.println("Welcome to vote");
			}
			else
			{
				throw new ArithmeticException("Not valid");
			}
	}
}