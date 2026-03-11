package com.sri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.dao.IEmployeeDao;
import com.sri.model.EmployeeBean;

@Service
public class EmployeeService implements IEmpoyeeService {

	@Autowired
	private IEmployeeDao dao;
	
	@Override
	public List<EmployeeBean> fetchEmployeeDegs(String degs1, String degs2, String degs3) throws Exception {
		degs1 = degs1.toUpperCase();
		degs2 = degs2.toUpperCase();
		degs3 = degs3.toUpperCase();
		
		List<EmployeeBean> list = dao.getEmployeeByDegs(degs1, degs2, degs3);
		list.forEach(emp->{
			Double sal = emp.getSalary();
			double gross = sal+(sal*0.5);
			emp.setGrossSalary(gross);
			Double net = gross-(gross*0.2);
			emp.setNetSalary(net);
		});
		return list;
	}

}
