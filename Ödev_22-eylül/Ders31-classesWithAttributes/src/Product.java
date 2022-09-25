public class Product {
	
	//Attribute or field
	private int id; //only defined block
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String code;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;		//this class'es(Product) id
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getCode() {
		return this.name.substring(0, 3)+ this.id;
	}

	
	
	
	
}
