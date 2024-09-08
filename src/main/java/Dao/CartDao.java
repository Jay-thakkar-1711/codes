package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connectivity.DBConnectivity;
import model.Cart;

public class CartDao {
	public static void insertCart(Cart c)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="insert into cart(cus_id,p_id,price,quantity,ttl_price,sub_ttl,payment_status) values(?,?,?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getCus_id());
			pst.setInt(2, c.getP_id());
			pst.setDouble(3, c.getPrice());
			pst.setInt(4, c.getQty());
			pst.setDouble(5, c.getTtl_price());
			pst.setDouble(6, c.getSub_ttl());
			pst.setString(7, c.getPayment_status());
			pst.executeUpdate();
			System.out.println("Data inserted to cart");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static List<Cart> getProductByCusid(int cid)
	{
		List<Cart> list = new ArrayList<Cart>();
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from cart where cus_id=? and payment_status='pending'";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cid);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Cart c=new Cart();
				c.setCart_id(rs.getInt("cart_id"));
				c.setCus_id(rs.getInt("cus_id"));
				c.setP_id(rs.getInt("p_id"));
				c.setPrice(rs.getDouble("price"));
				c.setQty(rs.getInt("quantity"));
				c.setTtl_price(rs.getDouble("ttl_price"));
				c.setSub_ttl(rs.getDouble("sub_ttl"));
				c.setPayment_status(rs.getString("payment_status"));
				list.add(c);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public static void updateCart(Cart c)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="update cart set quantity=?,ttl_price=? where cart_id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,c.getQty());
			pst.setDouble(2, c.getTtl_price());
			pst.setInt(3, c.getCart_id());
			pst.executeUpdate();
			System.out.println("Cart Updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteCart(int cart_id) 
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="delete from cart where cart_id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cart_id);
			pst.executeUpdate();
			System.out.println("Deleted from Cart");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean checkCart(int cusid,int pid)
	{
		boolean flag=false;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from cart where cus_id=? and p_id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			pst.setInt(2, pid);
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
	public static void updateStatus(int cart_id)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="update cart set payment_status='successfull' where cart_id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cart_id);
			pst.executeUpdate();
			System.out.println("Status updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
