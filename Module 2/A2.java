import java.util.*;
class A2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		String a=sc.next();
		if(a.length()>1)
		{
			System.out.println("ERROR!!! Length is more than 1");
		}
		else
		{
			char b=a.charAt(0);
			if(Character.isLetter(b))
			{
				if(b=='a' || b=='e' || b=='i' || b=='o' ||b=='u')
				{
					System.out.println("It is a vowel");
				}
				else
				{
					System.out.println("It is a consonant");
				}
			}
			else 
			{
				System.out.println("ERROR!!!! It is a digit");
			}
		}
	}
}