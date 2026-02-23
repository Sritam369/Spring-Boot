package com.sri.comp;

public final class BlueDart implements Courier{

	@Override
	public String deliver(int oid) {		
		return oid+" order items are kept for delivery by bluedart";
	}

}
