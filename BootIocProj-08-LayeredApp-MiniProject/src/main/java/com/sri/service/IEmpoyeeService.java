package com.sri.service;

import java.util.List;

import com.sri.model.EmployeeBean;

public interface IEmpoyeeService {
   List<EmployeeBean> fetchEmployeeDegs(String degs1,String degs2,String degs3)throws Exception;
}
