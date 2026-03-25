package com.sri;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sri.controller.EmployeeController;
import com.sri.model.Employee;

@SpringBootApplication
public class LayerdAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LayerdAppApplication.class, args);
		EmployeeController pc = ctx.getBean(EmployeeController.class);
		while(true) {
			try {
			int choice= Integer.parseInt(IO.readln("enter choice"));
			Employee p=  new Employee();
			if(choice==1) {
				String id = IO.readln("enter id");
				String name = IO.readln("Enter name");
				String dept  = IO.readln("enter department");
				double price = Double.parseDouble(IO.readln("enter sal"));
				
				p.setId(id);
				p.setName(name);
				p.setDept(dept);
				p.setSal(price);
				
				pc.add(p);
			}
			
			else if(choice==2) {
				List<Employee> list= pc.retrieve();
				list.forEach(e->{
					IO.println(e.getId());
					IO.println(e.getName());
					IO.println(e.getDept());
					IO.println(e.getSal());
				});
			}
			
			else if(choice==3) {
				String id = IO.readln("enter id");
				pc.delete(id);
			}
			else if(choice==4) {
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
