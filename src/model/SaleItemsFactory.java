package model;

import java.util.HashMap;

public class SaleItemsFactory {
	private static HashMap<String, SaleItems> saleItemsStorage = new HashMap<>();
	
	public SaleItems createSaleItems(String name, int quantity) {
		if(saleItemsStorage.containsKey(name))
			return saleItemsStorage.get(name);
		SaleItems newSaleItems = new SaleItems(name, quantity);
		saleItemsStorage.put(name, newSaleItems);
		
		return newSaleItems;
	}
}
