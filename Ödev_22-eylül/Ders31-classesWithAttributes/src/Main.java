
public class Main {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.setId(1);;
		product1.setName("Laptop");
		product1.setDescription("ASUS Laptop");
		product1.setPrice(5000);
		product1.setStockAmount(3);
		String code1 =product1.getCode();
		System.out.println(code1);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);

	}

}
