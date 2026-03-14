package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.controller.ProductController;
import com.sri.model.Product;

@SpringBootApplication
public class LayerdAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LayerdAppApplication.class, args);
		ProductController pc = ctx.getBean(ProductController.class);
		while(true) {
			try {
			int choice= Integer.parseInt(IO.readln("enter choice"));
			Product p=  new Product();
			if(choice==1) {
				int id = Integer.parseInt(IO.readln("enter id"));
				String name = IO.readln("Enter name");
				String desc  = IO.readln("enter description");
				double price = Double.parseDouble(IO.readln("enter price"));
				
				p.setId(id);
				p.setName(name);
				p.setDesc(desc);
				p.setDesc(desc);
				
				pc.insertData(p);
			}
			
			else if(choice==2) {
				pc.retrieveData();
			}
			else if(choice==3) {
				int id = Integer.parseInt(IO.readln("enter id"));
				double price = Double.parseDouble(IO.readln("enter new price"));
				p.setId(id);
				p.setPrice(price);
				pc.updateData(p);
			}
			else if(choice==4) {
				int id = Integer.parseInt(IO.readln("enter id"));
				pc.deleteData(id);
			}
			else if(choice==5) {
				System.exit(0);
			}
			else {
				IO.println("Invalid data");
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
