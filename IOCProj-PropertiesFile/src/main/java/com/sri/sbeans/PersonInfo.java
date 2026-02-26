package com.sri.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pi")
public class PersonInfo {

	@Value("${per.id}")
	private Integer id;
	@Value("${per.name}")
	private String name;
	@Value("${per.address}")
	private String address;
	@Value("8658958889")
	private Long mobile;
	@Value("${os.name}")
	private String os_name;
	@Value("${os.version}")
	private String os_ver;
	@Value("${path}")
	private String path_data;
	
	
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", os_name="
				+ os_name + ", os_ver=" + os_ver + ", path_data=" + path_data + "]";
	}
	
	
}
