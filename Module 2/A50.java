import java.util.*;
class A50
{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list);
		System.out.println("Searching I element in list : "+list.contains("I"));
	}
}