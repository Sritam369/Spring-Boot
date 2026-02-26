package com.sri.sbeans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iv")
public class InvoiceService {

	@Autowired
	private Product product;
	@Autowired
	private TaxCalculator tax;
	
	public void printInvoice() {
		double total=product.getPrice()*product.getQuantity();
		System.out.println("Product "+product.getName());
		System.out.println("Quantity "+product.getQuantity());
		System.out.println("Total(Before Tax) "+total);
		System.out.println("Tax "+tax.calculateTax(total));
		System.out.println("Final Amount "+(tax.calculateTax(total)+total));
		
		
	}
}
