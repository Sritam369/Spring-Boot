package com.sri.dao;

import java.util.List;

import com.sri.model.EmployeeBean;

public interface IEmployeeDao {
 List<EmployeeBean> getEmployeeByDegs(String desg1,String degs2,String degs3)throws Exception;
}
