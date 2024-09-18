import java.util.*;
class A32
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks out of 100");
		int m=sc.nextInt();
		if(m>=91)
		{
			System.out.println("Grade : A");
		}
		else if(m>=81 && m<=90)
		{
			System.out.println("Grade : B+");
		}
		else if(m>=71 && m<=80)
		{
			System.out.println("Grade : B");
		}
		else if(m>=61 && m<=70)
		{
			System.out.println("Grade : C");
		}
		else if(m>=51 && m<=60)
		{
			System.out.println("Grade : D+");
		}
		else if(m>=41 && m<=50)
		{
			System.out.println("Grade : D");
		}
		else
		{
			System.out.println("FAIL!!!");	
		}
	}
}