package view;

import model.Product;
import model.Sale;
import model.SaleItems;

public class Main {

	public static void main(String[] args) {
		Product rice = new Product();
		rice.setDescription("Arroz Tatiana");
		rice.setPrice(33.45);

		Product bean = new Product();
		bean.setDescription("Feijão Roberto");
		bean.setPrice(12.45);
		
		Product pasta = new Product();
		pasta.setDescription("Arroz Tatiana");
		pasta.setPrice(33.45);
		
		SaleItems itemRice = new SaleItems();
		itemRice.setQuantity(1);
		itemRice.setProducts(rice);
		
		SaleItems itemBeans= new SaleItems();
		itemBeans.setQuantity(6);
		itemBeans.setProducts(bean);
		
		SaleItems itemPasta= new SaleItems();
		itemPasta.setQuantity(3);
		itemPasta.setProducts(pasta);
		
		Sale sale = new Sale();
		sale.addSaleItem(itemPasta);
		sale.addSaleItem(itemBeans);
		sale.addSaleItem(itemRice);
		
		for (SaleItems saleItens  : sale.getItems()) {
			System.out.println(saleItens);
		}
	}
	
}
