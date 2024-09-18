import java.util.*;
class A70
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(6);
		list1.add(3);
		list1.add(0);
		list1.add(7);
		int a[] = new int[5];
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list1.size();j++)
			{
				if(list.get(i)==list1.get(i))
				{
					System.out.println(list.get(i));
				}
			}
		}
	}
}