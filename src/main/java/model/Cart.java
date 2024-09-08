package model;

public class Cart {
	private int cart_id,cus_id,p_id,qty;
	private double price,ttl_price,sub_ttl;
	private String payment_status;
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTtl_price() {
		return ttl_price;
	}
	public void setTtl_price(double ttl_price) {
		this.ttl_price = ttl_price;
	}
	public double getSub_ttl() {
		return sub_ttl;
	}
	public void setSub_ttl(double sub_ttl) {
		this.sub_ttl = sub_ttl;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", cus_id=" + cus_id + ", p_id=" + p_id + ", qty=" + qty + ", price="
				+ price + ", ttl_price=" + ttl_price + ", sub_ttl=" + sub_ttl + ", payment_status=" + payment_status
				+ "]";
	}
		
}
