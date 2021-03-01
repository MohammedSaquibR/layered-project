package com.rakuten.training.ui;

import java.util.Scanner;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.*;

public class ProductConsoleUI {
		
	ProductServiceImpl service = new ProductServiceImpl();
		public void createProductWithUI() {
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Enter a name:");
			String name = kb.nextLine();
			System.out.println("Enter a price:");
			float price = Float.parseFloat(kb.nextLine());
			System.out.println("Enter a Qoh:");
			int qoh = Integer.parseInt(kb.nextLine());
			
			Product p = new Product(name,price,qoh);
			int id = service.addProduct(p);
			
			System.out.println("Created Product with ID:"+id);
		}
}
