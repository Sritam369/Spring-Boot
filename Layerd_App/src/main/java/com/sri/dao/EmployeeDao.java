package com.sri.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sri.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private DataSource ds;
	private final static String ADD_QUERY ="insert into employeex values(?,?,?,?)";
	private final static String DELETE_QUERY = "delete from employeex where id=?";
	private final static String RETRIEVE_QUERY ="select * from employeex";
	
	public int add(Employee e) {
		int rowCount = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(ADD_QUERY);
			psm.setString(1, e.getId());
			psm.setString(2, e.getName());
			psm.setString(3, e.getDept());
			psm.setDouble(4, e.getSal());
			rowCount = psm.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return rowCount;
	}
	
	public int delete(String id) {
		int rowCount = 0;
		try {
			Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(DELETE_QUERY);
			psm.setString(1, id);
			rowCount = psm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public List<Employee> retrieve(){
		List<Employee> list = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(RETRIEVE_QUERY);
			ResultSet rs = psm.executeQuery();
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getString(1));
				e.setName(rs.getString(2));
				e.setDept(rs.getString(3));
				e.setSal(rs.getDouble(4));
				list.add(e);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
