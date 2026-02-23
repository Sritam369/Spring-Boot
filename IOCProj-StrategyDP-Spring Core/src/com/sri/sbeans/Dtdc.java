package com.sri.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dt")
//@Primary
@Lazy(true)
public final class Dtdc implements Courier{
  public String deliver(int oid) {
	  return "DTDC courier is ready to deliver "+oid+" order number products";
  }
}
