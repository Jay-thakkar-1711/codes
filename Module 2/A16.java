import java.util.*;
class A16
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter the string to check whether it ends with it :");
		String s=sc.next();
		System.out.println("String ends with '"+s+" ' : "+str.endsWith(s));
	}
}