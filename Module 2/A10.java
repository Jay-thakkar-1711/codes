import java.util.*;
class A10
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit");
		int a=sc.nextInt();
		int aa=a*10+a;
		int aaa=aa*10+a;
		int sum=a+aa+aaa;
		System.out.println("Sum is : "+sum);
	}
}