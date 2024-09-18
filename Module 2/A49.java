import java.util.*;
class A49
{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list);
		System.out.println("Removing third element : "+list.remove(3));
		System.out.println(list);
	}
}