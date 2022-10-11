
public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) { //call with class name
			System.out.println("Added");
		}
		else {
			System.out.println("Invalid product information");
		}
		
	}
}
