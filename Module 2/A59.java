import java.util.*;
class A59
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ListIterator itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		System.out.println();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println();
	}
}