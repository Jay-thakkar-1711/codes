import java.util.*;
class A13
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter a index");
		int index=sc.nextInt();
		System.out.println("Value at the index is : "+str.charAt(index));
	}
}