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

import com.sri.model.ProductBean;

@Repository("pd")
public class ProductDao implements IProduct {

	@Autowired
	private DataSource ds;
	private final static String INSERT_DATA="insert into productlab values(?,?,?,?)";
	private final static String RETRIEVE_DATA = "select * from productlab";
	private static final String DELETE_PRODUCT = "delete from productlab where productid=? ";
	private static final String UPDATE_PRODUCT = "update productlab set productname=? , description=?, price=? where productid=?";
	
	@Override
	public int insertData(ProductBean pb) throws Exception {
		int rowCount = 0;
		
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(INSERT_DATA);
				){
			
			psm.setInt(1, pb.getProductId());
			psm.setString(2, pb.getProductName());
			psm.setString(3, pb.getDescription());
			psm.setDouble(4, pb.getPrice());
			
			 rowCount = psm.executeUpdate();
		}
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}
	
	public List<ProductBean> getAllProducts() throws Exception{
		List<ProductBean> list = new ArrayList<>();
		
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(RETRIEVE_DATA);
				){
			ResultSet rs = psm.executeQuery();
			while(rs.next()) {
				ProductBean pb = new ProductBean();
				pb.setProductId(rs.getInt(1));
				pb.setProductName(rs.getString(2));
				pb.setDescription(rs.getString(3));
				pb.setPrice(rs.getDouble(4));
				
				list.add(pb);
			}
		}
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		
		return list;
	}
	
	public int deleteProduct(int productId)throws Exception{
		
		int rowCount=0;
		
		try(Connection con = ds.getConnection();
				PreparedStatement psm = con.prepareStatement(DELETE_PRODUCT);
					){
			psm.setInt(1, productId);
			 rowCount = psm.executeUpdate();
		}
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}
	
	public int updateProduct(ProductBean pb)throws Exception{
    int rowCount=0;
		
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(UPDATE_PRODUCT);
					){
			
	psm.setString(1, pb.getProductName());	
	psm.setString(2, pb.getDescription());	
	psm.setDouble(3,pb.getPrice());
	psm.setInt(4, pb.getProductId());
	
	rowCount = psm.executeUpdate();
	}
		catch(SQLException se) {
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}

}
