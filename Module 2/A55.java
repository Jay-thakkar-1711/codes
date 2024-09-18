import java.util.*;
class A55
{
	public static void main(String[] args) {
		HashSet list = new HashSet();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}