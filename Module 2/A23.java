import java.util.*;
class Member
{
	private int datamember,age;
	private String name,address;
	private long contact; 
	private double salary;
	public Member(int datamember,String name,int age,long contact,String address,double salary)
	{
		this.datamember=datamember;
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.address=address;
		this.salary=salary;
	}
	public void printSalary()
	{
		System.out.println("Salary is : "+salary);
	}

}
public class A23
{
	public static void main(String[] args) {
		Member m=new Member(1,"abc",25,9876541230,"Ahmedabad",50000.00);
		m.printSalary();
	}
}