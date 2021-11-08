package entites;

public class product {

	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity; 
	}
	
	public String toString() {
		return name.toUpperCase() + ", $ " + String.format("%.2f", price) + ", " + quantity + " units. Total: $" + String.format("%.2f", totalValueInStock());
		
	}

}
