package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<SaleItems> items = new ArrayList<>();
	
	public void addItem(String name, int quantity) {
		SaleItemsFactory newSaleItems = new SaleItemsFactory();
		items.add(newSaleItems.createSaleItems(name, quantity));
	}
	
	public String[] getItems(){
		String[] stringItems = new String[items.size()];
		int i = 0;
		for (SaleItems listItems : items) {
			stringItems[i] = listItems.toString();
			i++;
		}
		
		return stringItems;
	}
	
	public Double getTotalPrice() {
		Double total = 0.0;
		
		for (SaleItems saleItems : items) {
			total += saleItems.getSubTotalPrice();
		}
		
		return total;
	}
}
