package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connectivity.DBConnectivity;
import model.Product;

public class ProductDao {
	public static void insertProduct(Product p) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "insert into product(sid,pname,image,pprice,pcategory,pdesc) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2, p.getPname());
			pst.setString(3, p.getImage());
			pst.setDouble(4, p.getPprice());
			pst.setString(5, p.getPcategory());
			pst.setString(6, p.getPdesc());
			pst.executeUpdate();
			System.out.println("Product inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Product> getProductBySid(int sid) {
		List<Product> list = new ArrayList<Product>();
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "select * from product where sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setPname(rs.getString("pname"));
				p.setPprice(rs.getDouble("pprice"));
				p.setImage(rs.getString("image"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPdesc(rs.getString("pdesc"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Product getProductByPid(int pid) {
		Product p = null;
		//System.out.println("function called");
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "select * from product where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setPname(rs.getString("pname"));
				p.setImage(rs.getString("image"));
				p.setPprice(rs.getDouble("pprice"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPdesc(rs.getString("pdesc"));
				//System.out.println("product fetched : "+p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public static void updateProduct(Product p) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "update product set pname=?,image=?,pprice=?,pcategory=?,pdesc=? where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getPname());
			pst.setString(2, p.getImage());
			pst.setDouble(3, p.getPprice());
			pst.setString(4, p.getPcategory());
			pst.setString(5, p.getPdesc());
			pst.setDouble(6, p.getPid());
			pst.executeUpdate();
			System.out.println("Product Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteProduct(int pid)
	{
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="delete from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
			System.out.println("Product Deleted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static List<Product> getAllProducts()
	{
		List<Product> l=new ArrayList<Product>();
		try
		{
			Connection conn=DBConnectivity.createConnection();
			String sql="select * from product";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setPname(rs.getString("pname"));
				p.setImage(rs.getString("image"));
				p.setPprice(rs.getDouble("pprice"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPdesc(rs.getString("pdesc"));
				l.add(p);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}
}
