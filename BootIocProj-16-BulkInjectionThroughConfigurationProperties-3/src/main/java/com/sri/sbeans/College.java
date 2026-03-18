package com.sri.sbeans;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("c")
@Data
@ConfigurationProperties(prefix="student.details")
public class College {

	private List<Student> list;
}
