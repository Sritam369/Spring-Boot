package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {

	@Value("12345")
	private Integer hotelId;	
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addr}")
	private String hotelAddr;
	@Value("${hotel.contact}")
	private String mob;
	
	@Value("${customer.name}")
	private String custName;
	@Value("#{menu.idlyPrice+menu.dosaPrice}")// SPEL used to perform arithmatic/logical operation while injecting value
	private double billAmount;
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddr=" + hotelAddr + ", mob=" + mob
				+ ", custName=" + custName + ", billAmount=" + billAmount + "]";
	}
	
	
}
