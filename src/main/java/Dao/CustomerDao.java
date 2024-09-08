package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connectivity.DBConnectivity;
import model.Customer;

public class CustomerDao {
	public static void insertCustomer(Customer c)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setLong(2, c.getContact());
			pst.setString(3, c.getAddress());
			pst.setString(4, c.getEmail());
			pst.setString(5, c.getPassword());
			pst.executeUpdate();
			System.out.println("Data inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean checkEmail(String email)
	{
		boolean flag=false;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from customer where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,email);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
		return flag;
	}
	public static Customer getLogin(Customer c)
	{
		Customer c1=null;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from customer where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, c.getEmail());
			pst.setString(2, c.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				c1=new Customer();
				c1.setId(rs.getInt("id"));
				c1.setName(rs.getString("name"));
				c1.setContact(rs.getLong("contact"));
				c1.setAddress(rs.getString("address"));
				c1.setEmail(rs.getString("email"));
				c1.setPassword(rs.getString("password"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c1;
	}
	public static void updateCustomer(Customer c)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="update customer set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setLong(2, c.getContact());
			pst.setString(3, c.getAddress());
			pst.setString(4, c.getEmail());
			pst.setInt(5, c.getId());
			pst.executeUpdate();
			System.out.println("Data updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean checkOldPassword(String email,String op)
	{
		boolean flag=false;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from customer where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, op);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	public static void updatePassword(String email,String pswd)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="update customer set password=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, pswd);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("Password Updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
