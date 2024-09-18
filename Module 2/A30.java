import java.util.*;
class Fact
{
	public void Factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find its factorial");
		int a=sc.nextInt();
		int fact1=1;
		while(a>0)
		{
			fact1=fact1*(a);
			a--;
		}
		System.out.println("Factorial is : "+fact1);
	}
}
public class A30
{
	public static void main(String[] args) {
		Fact f=new Fact();
		f.Factorial();
	}
}