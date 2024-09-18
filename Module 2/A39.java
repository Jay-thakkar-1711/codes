import java.io.*;
class AgeNotWithinRangeException extends Exception
{
	AgeNotWithinRangeException(String s)
	{
		super(s);
	}
}
class NameNotValidException extends Exception
{
	NameNotValidException(String s)
	{
		super(s);
	}
}
class Student
{
	private int rollno,age;
	private String name,course;
	Student(int rollno,String name,int age,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	public void data() throws AgeNotWithinRangeException,NameNotValidException
	{
		if(age<15 || age>21)
		{
			throw new AgeNotWithinRangeException("Age is not between 15 to 21 years");
		}
		else if(!name.matches("[A-Za-z]+"))
		{
			throw new NameNotValidException("Name should contain only alphabets");
		}
		else
		{
			System.out.println("Roll no is : "+rollno);
			System.out.println("Name is : "+name);
			System.out.println("Age is : "+age);
			System.out.println("Course is : "+course);
		}
	}
}
public class A39
{
	public static void main(String[] args) {
		try
		{
			Student s=new Student(1,"abcd",14,"java");
		Student s1=new Student(2,"abc1",16,"java");
		//s.data();
		s1.data();
		}
		catch(AgeNotWithinRangeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NameNotValidException n)
		{
			System.out.println(n.getMessage());
		}
	}
}