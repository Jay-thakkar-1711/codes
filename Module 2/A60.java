import java.util.*;
class A60
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println("Extracting some portion : ");
		List l1=new ArrayList();
		l1=list.subList(0, 3);
		System.out.println(l1);
	}
}