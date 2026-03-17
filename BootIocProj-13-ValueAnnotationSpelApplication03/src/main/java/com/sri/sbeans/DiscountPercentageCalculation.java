package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dpc")
@Data
public class DiscountPercentageCalculation {

	@Autowired
	private ProductDetails pd;
	@Value("#{pd.price-(pd.price*pd.discount/100)}")
	private double finalPrice;
}
