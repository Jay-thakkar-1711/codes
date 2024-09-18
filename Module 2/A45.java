import java.util.*;
class A45
{
	public static void main(String[] args) {
		List<String> l2=new ArrayList<String>();
		l2.add("Red");
		l2.add("Yellow");
		l2.add("Black");
		l2.add("Green");
		l2.add("White");
		Iterator itr=l2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}