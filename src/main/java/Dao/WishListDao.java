package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connectivity.DBConnectivity;
import model.WishList;

public class WishListDao {
	public static void insertWishlist(int cusid,int pid)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="insert into wishlist(cus_id,pid) values(?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			pst.setInt(2, pid);
			pst.executeUpdate();
			System.out.println("Data inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static List<WishList> getAllProductsByCusId(int cusid)
	{
		List<WishList> l1=new ArrayList<WishList>();
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from wishlist where cus_id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				WishList w=new WishList();
				w.setWid(rs.getInt("wid"));
				w.setCusid(rs.getInt("cus_id"));
				w.setPid(rs.getInt("pid"));
				l1.add(w);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l1;
	}
	public static boolean checkWishList(int cusid,int pid)
	{
		boolean flag=false;
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from wishlist where cus_id=? and pid=?";
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
	public static void deleteWishList(int wid)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="delete from wishlist where wid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, wid);
			pst.executeUpdate();
			System.out.println("Deleted from wishlist");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
