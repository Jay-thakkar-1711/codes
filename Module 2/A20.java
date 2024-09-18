import java.util.*;
class PrintData
{
	public void print(int i,char c)
	{
		System.out.println("Integer is : "+i);
		System.out.println("Character is : "+c);
	}
	public void print(char c,int i)
	{
		System.out.println("Character is : "+c);
		System.out.println("Integer is : "+i);
	}
}
public class A20
{
	public static void main(String[] args) {
		PrintData pd=new PrintData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and a Character");
		int a=sc.nextInt();
		String s=sc.next();
		char c=s.charAt(0);
		pd.print(a,c);
		pd.print(c,a);
	}
}