import java.util.*;
abstract class Bank
{
	abstract void getBalance();
}
class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("Balance is : $100");
	}
}
class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("Balance is : $150");
	}
} 
class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("Balance is : $200");
	}
}
public class A28
{
	public static void main(String[] args) {
		BankA b1=new BankA();
		BankB b2=new BankB();
		BankC b3=new BankC();
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}
}