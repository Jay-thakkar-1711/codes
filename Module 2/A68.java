import java.util.*;
class A68
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of element you want to replace : ");
		int a=sc.nextInt();
		Collections.swap(list,2,a);
		System.out.println("Edited List is : ");
		System.out.println(list);
	}
}