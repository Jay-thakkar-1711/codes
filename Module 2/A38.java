import java.io.*;
import java.util.*;
class invalidBalanceException extends Exception
{
	invalidBalanceException(String s)
	{
		super(s);
	}
}
public class A38
{
	public static void main(String[] args) throws invalidBalanceException{
			int Balance=2000;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount you want to withdraw");
			int bal=sc.nextInt();
			if(bal>Balance)
			{
				throw new invalidBalanceException("Insufficient Balance");
			}
			else{
				System.out.println("Amount withdraw");
				Balance=Balance-bal;
		}
	}
}