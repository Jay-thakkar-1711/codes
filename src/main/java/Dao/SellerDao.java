package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
			pst.setString(1,s.getName());
			pst.setLong(2,s.getContact());
			pst.setString(3,s.getAddress());
			pst.setString(4,s.getEmail());
			pst.setString(5,s.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
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
			pst.setString(1,email);
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
}
