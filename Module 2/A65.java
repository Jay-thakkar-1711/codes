import java.util.*;
class A64
{
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("Hash Set : ");
		System.out.println(set);
		ArrayList list=new ArrayList();
		list.addAll(set);
		System.out.println("Converted to Array List : ");
		System.out.println(list);
	}
}