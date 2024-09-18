import java.util.*;
class A4
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 numbers");
		int a[] = new int[5];
		int sum=0,avg;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum is : "+sum);
		avg=sum/5;
		System.out.println("Average is : "+avg);

	}
}