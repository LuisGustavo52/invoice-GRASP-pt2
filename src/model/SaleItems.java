package model;

public class SaleItems {
	private Product product;
	private int quantity;
	
	public SaleItems(String productName, int quantity) {
		this.quantity = quantity;
		this.product = new Product();
		this.product.setDescription(productName);
		this.product.setPrice(0.0);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product products) {
		this.product = products;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalPrice(){
		return quantity * product.getPrice();
	}
	@Override
	public String toString() {
		String intemStr = String.format("%s %d %.2f",
				this.getProduct().getDescription(),
				this.getQuantity(),
				this.getSubTotalPrice());
		
		return intemStr;
	}
}
