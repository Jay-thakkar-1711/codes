import java.util.*;
class A64
{
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("Hash Set : ");
		System.out.println(set);
		Integer a[] =new Integer[set.size()];
		set.toArray(a);
		System.out.println("Converted to array :");
		for(Integer i:a)
		{
			System.out.println(i);
		}
	}
}