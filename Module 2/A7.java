import java.util.*;
class A7
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int count=0;
		while(a!=0)
		{
			count++;
			a=a/10;
		}
		System.out.println("Count is : "+count);
	}
}