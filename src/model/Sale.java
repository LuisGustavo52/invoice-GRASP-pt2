package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItems> items;
	
	public void addSaleItem(SaleItems saleItems) {
		items.add(saleItems);
	}
	
	public List<SaleItems> getItems(){
		return new ArrayList<SaleItems>(items);
	}
	
	public Double getTotalPrice() {
		Double total = 0.0;
		
		for (SaleItems saleItems : items) {
			total += saleItems.getSubTotalPrice();
		}
		
		return total;
	}
}
