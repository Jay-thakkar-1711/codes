import java.util.*;
class A63
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
		list1.add("6");
		list1.add("7");
		list1.add("8");
		list1.add("9");
		list1.add("0");
		System.out.println(list1);
		ArrayList<String> l1=new ArrayList<>();
		l1.addAll(list);
		l1.addAll(list1);
		System.out.println(l1);
	}
}