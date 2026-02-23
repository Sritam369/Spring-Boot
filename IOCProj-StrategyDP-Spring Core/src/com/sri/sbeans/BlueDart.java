package com.sri.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bd")
@Lazy(true)
public final class BlueDart implements Courier{
  public String deliver(int oid) {
	  return "BlueDart courier is ready to deliver "+oid+" order number products";
  }
}
