
public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1, "Laptop", "ASUS Laptop", 5000, 3);

		String code1 =product1.getCode();
		System.out.println(code1);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);

	}

}
