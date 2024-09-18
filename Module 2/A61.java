import java.util.*;
class A61
{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("6");
		list1.add("4");
		list1.add("5");
		System.out.println(list1);
		ArrayList<String> l1=new ArrayList<>();
		for(String e:list)
		{
			l1.add(list1.contains(e) ? "Yes" : "No");
		}
		System.out.println(l1);
	}
}