import java.util.*;
class A53
{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("F");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("B");
		System.out.println("Original list :");
		System.out.println(list);
		Random r1=new Random();
		for(int i=list.size()-1;i>=1;i--)
		{
			Collections.swap(list,i,r1.nextInt(i+1));
		}
		System.out.println("Shuffled list :");
		System.out.println(list);
	}
}