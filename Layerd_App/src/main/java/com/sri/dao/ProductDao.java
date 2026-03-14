package com.sri.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sri.model.Product;

@Repository
public class ProductDao {

	@Autowired
	private DataSource ds;
	private static final String INSERT_DATA = "insert into productlab values(?,?,?,?)"; 
	private static final String RETRIEVE_DATA = "SELECT * FROM PRODUCTLAB"; 
	private static final String UPDATE_DATA = "update productlab set price=? where productid=?"; 
	private static final String DELETE_DATA = "delete from productlab where productid=?";
	
	public int insertData(Product p) throws Exception {
		
		int rowCount = 0;
		
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(INSERT_DATA);){
			
			psm.setInt(1, p.getId());
			psm.setString(2, p.getName());
			psm.setString(3, p.getDesc());
			psm.setDouble(4, p.getPrice());
			
			rowCount = psm.executeUpdate();
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}
	
	public List<Product> getData() throws Exception{
		List<Product> list = new ArrayList<>();
	try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(RETRIEVE_DATA);){
		
         ResultSet rs = psm.executeQuery();
         while(rs.next()) {
        	 
        	 Product p = new Product();
        	 p.setId(rs.getInt(1));
        	 p.setName(rs.getString(2));
        	 p.setDesc(rs.getString(3));
        	 p.setPrice(rs.getDouble(4));
        	 
        	 list.add(p);
         }
		
		
	}
	catch(Exception e) {
		throw e;
	}
	
	return list;
}
	
public int updateData(Product p) throws Exception {
		
		int rowCount = 0;
		
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(INSERT_DATA);){

			psm.setDouble(1, p.getPrice());
			psm.setInt(2, p.getId());
			
			rowCount = psm.executeUpdate();
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}

public int deleteData(int id) throws Exception {
	
	int rowCount = 0;
	
	try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(INSERT_DATA);){

		psm.setInt(1, id);
		
		rowCount = psm.executeUpdate();
	}
	catch(Exception e) {
		throw e;
	}
	
	return rowCount;
}

}
