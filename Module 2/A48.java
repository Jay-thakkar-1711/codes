import java.util.*;
class A48
{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list);
		System.out.println("Update element at specific index in ArrayList");
		list.set(3,"F");
		System.out.println(list);
	}
}