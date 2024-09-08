package Dao;

import Connectivity.DBConnectivity;
import model.Customer;

public class CustomerDao {
	public static void insertCustomer(Customer c)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,c.getName());
			pst.setLong(2,c.getContact());
			pst.setString(3,c.getAddress());
			pst.setString(4,c.getEmail());
			pst.setString(5,c.getPassword());
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
			e.printStackTrace();
		}
		return flag;
	}
}
