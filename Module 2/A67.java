import java.util.*;
class A67
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println("Original size is : "+list.size());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which you have to increase the size : ");
		int s=sc.nextInt();
		System.out.println("Enter the elements : ");
		int a[]=new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			list.add(a[i]);
		}
		System.out.println("After increasing size is : "+list.size());
		System.out.println("New List is :");
		System.out.println(list);

	}
}