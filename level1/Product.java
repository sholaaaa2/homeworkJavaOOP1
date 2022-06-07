package level1;

public class Product {
	private double price;
	private String description;
	private int weight;

	public Product(double price, String description, int weight) {
		this.price = price;
		this.description = description;
		this.weight = weight;
	}

	public Product() {
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return "Product [price=" + price + ", description=" + description + ", weight=" + weight + "]";
	}

}
