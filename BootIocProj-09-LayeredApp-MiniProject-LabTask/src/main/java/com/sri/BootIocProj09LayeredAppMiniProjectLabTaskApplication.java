package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.controller.ProductController;
import com.sri.model.ProductBean;

@SpringBootApplication
public class BootIocProj09LayeredAppMiniProjectLabTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocProj09LayeredAppMiniProjectLabTaskApplication.class, args);
		ProductController bean = ctx.getBean(ProductController.class);
		
		IO.println("1. Add Products");
		IO.println("2. View All Products");
		IO.println("3. Update Products");
		IO.println("4. Delete Products");
		IO.println("5. Exit");
		
		while(true) {
			try {
			int choice = Integer.parseInt(IO.readln("Enter your choice"));
			if (choice==1) {
		int id  = Integer.parseInt(IO.readln("enter id"));
		String name = IO.readln("enter name");
		String desc = IO.readln("enter product descriptions");
		double price = Double.parseDouble(IO.readln("enter price"));
		
		ProductBean pb =new ProductBean();
		pb.setProductId(id);
		pb.setProductName(name);
		pb.setDescription(desc);
		pb.setPrice(price);
		bean.addProduct(pb);
				
			}
		else if(choice==2) {
		bean.retrieveAllProducts();
			}
		else if(choice==3) {
			int id = Integer.parseInt(IO.readln("enter product id to be deleted"));
			bean.deleteProduct(id);
		}
		
		else if(choice==4) {
			int id  = Integer.parseInt(IO.readln("enter product id to be updated"));
			String name = IO.readln("enter new name");
			String desc = IO.readln("enter new product descriptions");
			double price = Double.parseDouble(IO.readln("enter new price"));
			
			ProductBean pb =new ProductBean();
			pb.setProductId(id);
			pb.setProductName(name);
			pb.setDescription(desc);
			pb.setPrice(price);
			bean.updateProduct(pb);
		}
		else if(choice==5) {
			System.exit(0);
		}
		else {
			IO.println("Invalid choice");
		}
		}
		catch(Exception e) {
			IO.println("Uncommon error occured : "+e.getMessage());
		}
	}
	}
}
