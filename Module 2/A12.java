import java.util.*;
class A12
{
	public static void main(String[] args) {
		System.out.println("Number divisible by only 3 :");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.println("Number divisible by only 5 :");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Number divisible by both 3 and 5 :");
		for(int i=1;i<=100;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				System.out.print(i+"\t");
			}
		}
	}
}