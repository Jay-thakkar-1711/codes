import java.util.*;
class A52
{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("F");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("B");
		System.out.println(list);
		List l1=new ArrayList();
		l1.addAll(list);
		System.out.println(l1);
	}
}