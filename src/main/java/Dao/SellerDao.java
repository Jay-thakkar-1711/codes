package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connectivity.DBConnectivity;
import model.Seller;

public class SellerDao {
	public static void insertSeller(Seller s)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="insert into seller(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setString(5,s.getPassword());
			pst.executeUpdate();
			System.out.println("Data Inserted");
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
			String sql="select * from seller where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
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
	public static Seller getLogin(Seller s)
	{
		Seller s1=null;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from seller where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				s1=new Seller();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s1;
	}
	public static void updateSeller(Seller s)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="update seller set name=?,contact=?,address=?,email=? where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setLong(2, s.getContact());
			pst.setString(3, s.getAddress());
			pst.setString(4, s.getEmail());
			pst.setInt(5, s.getId());
			pst.executeUpdate();
			System.out.println("Data updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean checkEmailandOP(String email,String op)
	{
		boolean flag=false;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from seller where email=? and password=?";
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
	public static void changePassword(String email,String np)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="update seller set password=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1,np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("Password updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
