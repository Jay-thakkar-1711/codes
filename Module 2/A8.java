import java.util.*;
class A8
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int space=0,letter=0,num=0,spe_char=0;
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(Character.isLetter(a))
			{
				letter++;
			}
			else if(Character.isWhitespace(a))
			{
				space++;
			}
			else if(Character.isDigit(a))
			{
				num++;
			}
			else
			{
				spe_char++;
			}
		}
		
		
		System.out.println("Total number of letters are : "+letter);
		System.out.println("Total number of digits are : "+num);
		System.out.println("Total number of space are : "+space);
		System.out.println("Total number of other characters are : "+spe_char);
	}
}