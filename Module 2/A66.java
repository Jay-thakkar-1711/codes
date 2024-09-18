import java.util.*;
class A66
{
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1,"java");
		map.put(2,"html");
		map.put(3,"dbms");
		map.put(4,"python");
		map.put(5,"php");
		System.out.println(map);
		System.out.println("Map Contains 1 as key : "+map.containsKey(1));
		System.out.println("Map contains php as value : "+map.containsValue("php"));
	}
}