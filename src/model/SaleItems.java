package model;

public class SaleItems {
	private Product products;
	private int quantity;
	
	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalPrice(){
		return quantity * products.getPrice();
	}
	@Override
	public String toString() {
		String intemStr = String.format("%s %d %.2f",
				this.getProducts().getDescription(),
				this.getQuantity(),
				this.getSubTotalPrice());
		
		return intemStr;
	}
}
