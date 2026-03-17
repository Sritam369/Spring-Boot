package com.sri.sbeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("menu")
@Data
public class MenuItemPrices {

	@Value("${menu.dosarate}")
	private double dosaPrice;
	@Value("${menu.idlyrate}")
	private double idlyPrice;
	@Value("${menu.poharate}")
	private double pohaRate;
	@Value("${menu.vprate}")
	private double vadapavRate;
}
