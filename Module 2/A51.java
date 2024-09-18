import java.util.*;
class A51
{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("F");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("B");
		System.out.println("Unsorted List :");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Unsorted List :");
		System.out.println(list);
		
	}
}