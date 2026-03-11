package com.sri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sri.model.EmployeeBean;
import com.sri.service.IEmpoyeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmpoyeeService service;
	
	public List<EmployeeBean> showEmpDegs(String degs1,String degs2,String degs3)throws Exception{
		List<EmployeeBean> list = service.fetchEmployeeDegs(degs1, degs2, degs3);
		return list;
	}
}
