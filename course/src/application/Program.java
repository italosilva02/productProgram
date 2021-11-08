package application;

import java.util.Locale;
import java.util.Scanner;

import entites.product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		entites.product product = new product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: R$ ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock:  ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product Data: " + product);
		System.out.println();
		System.out.println("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		
		System.out.println();
		System.out.println("Update data " + product);
		
		System.out.println();
		System.out.println("Enter the number of product to be removed in stock: ");
		quantity = sc.nextInt();
		
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Update data " + product);
		
		sc.close();

	}

}
