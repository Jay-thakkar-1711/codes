import java.util.*;
class PrintNumbers
{
	public void printn(int i)
	{
		System.out.println("Number is : "+i);
	}
	public void printn(double d)
	{
		System.out.println("Number is : "+d);
	}
	public void printn(long l)
	{
		System.out.println("Number is : "+l);
	}
}
public class A19
{
	public static void main(String[] args) {
		PrintNumbers pn=new PrintNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of different data type");
		int i=sc.nextInt();
		long l = sc.nextLong();
		double d=sc.nextDouble();
		pn.printn(i);
		pn.printn(d);
		pn.printn(l);
	}
}