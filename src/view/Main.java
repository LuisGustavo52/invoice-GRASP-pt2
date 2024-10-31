package view;


import model.Sale;

public class Main {

	public static void main(String[] args) {
//		Product rice = new Product();
//		rice.setDescription("Arroz Tatiana");
//		rice.setPrice(33.45);
//
//		Product bean = new Product();
//		bean.setDescription("Feijão Roberto");
//		bean.setPrice(12.45);
//		
//		Product pasta = new Product();
//		pasta.setDescription("Arroz Tatiana");
//		pasta.setPrice(33.45);
//		
//		SaleItems itemRice = new SaleItems();
//		itemRice.setQuantity(1);
//		itemRice.setProduct(rice);
//		
//		SaleItems itemBeans= new SaleItems();
//		itemBeans.setQuantity(6);
//		itemBeans.setProduct(bean);
//		
//		SaleItems itemPasta= new SaleItems();
//		itemPasta.setQuantity(3);
//		itemPasta.setProduct(pasta);
//		
//		
		Sale sale = new Sale();
		sale.addItem("Arroz Tatiana", 3);
		sale.addItem("Macarráo Luis", 1);
		sale.addItem("Feijáo Zezinho", 2);
		
		for (String items : sale.getItems()) {
			System.out.println(items);
		}
		System.out.println("--------------------------------\nValor total: "+sale.getTotalPrice());
	}
	
}
