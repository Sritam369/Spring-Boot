package com.sri.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sri.model.EmployeeBean;

@Repository
public class EmployeeDao implements IEmployeeDao {
	
	@Autowired
	private DataSource ds;
	private static final String GET_EMPS_QUERY = "SELECT EMPNO,ENAME,DEPTNO,SAL,JOB FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB"; 

	@Override
	public List<EmployeeBean> getEmployeeByDegs(String desg1, String degs2, String degs3) throws Exception {
		
		List<EmployeeBean>list = new ArrayList<>();
		
		Connection con = ds.getConnection();
		try(con){
			PreparedStatement psm = con.prepareStatement(GET_EMPS_QUERY);
			psm.setString(1, desg1);
			psm.setString(2, degs2);
			psm.setString(3, degs3);
			ResultSet rs = psm.executeQuery();
			while(rs.next()) {
				EmployeeBean eb = new EmployeeBean();
				eb.setEno(rs.getInt(1));
				eb.setEname(rs.getString(2));
				eb.setDeptNo(rs.getInt(3));
				eb.setSalary(rs.getDouble(4));
				eb.setJob(rs.getString(5));
				list.add(eb);
			}
		}
		catch(Exception e) {
			throw e;
		}
		
		return list;
	}

}
