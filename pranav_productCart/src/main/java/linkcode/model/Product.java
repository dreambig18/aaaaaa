package linkcode.model;

public class Product {
	
	private int Productid;
	private String ProductName;
	private float ProdPrice;
	private int ProductQty;
	
	public Product() {
		
	}

	public Product(int productid, String productName, float prodPrice, int productQty) {
		super();
		Productid = productid;
		ProductName = productName;
		ProdPrice = prodPrice;
		ProductQty = productQty;
	}

	public int getProductid() {
		return Productid;
	}

	public void setProductid(int productid) {
		Productid = productid;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getProdPrice() {
		return ProdPrice;
	}

	public void setProdPrice(float prodPrice) {
		ProdPrice = prodPrice;
	}

	public int getProductQty() {
		return ProductQty;
	}

	public void setProductQty(int productQty) {
		ProductQty = productQty;
	}
	

}
