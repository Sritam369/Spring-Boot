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

import com.sri.model.Book;

@Repository
public class BookDaoImpl implements IBookDao{

	@Autowired
	private DataSource ds;
	private final static String INSERT_DATA="INSERT INTO BOOKLAB VALUES(s1.nextval,?,?,?)";
	private final static String RETRIEVE_DATA="SELECT * FROM BOOKLAB";
	private final static String UPDATE_DATA="UPDATE BOOKLAB SET TITLE=?,AUTHOR=?,PRICE=? WHERE BOOKID=?";
	private final static String DELETE_DATA="DELETE FROM BOOKLAB WHERE BOOKID=?";
	
	@Override
	public int insertBook(Book b) throws Exception {
		int rowCount=0;
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(INSERT_DATA)){
			
			psm.setString(1, b.getTitle());
			psm.setString(2, b.getAuthor());
			psm.setDouble(3, b.getPrice());
			
			rowCount = psm.executeUpdate();
			
		}
		catch(SQLException s) {
			throw s;
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}
	@Override
	public List<Book> getAllBooks() throws Exception {
		List<Book> list = new ArrayList<>();
		try(Connection con = ds.getConnection();
				PreparedStatement psm = con.prepareStatement(RETRIEVE_DATA)){

				ResultSet rs = psm.executeQuery();
				while(rs.next()) {
					Book b = new Book();
					b.setId(rs.getInt(1));
					b.setTitle(rs.getString(2));
					b.setAuthor(rs.getString(3));
					b.setPrice(rs.getDouble(4));
					
					list.add(b);
				}
			}
			catch(SQLException s) {
				throw s;
			}
			catch(Exception e) {
				throw e;
			}
			
			return list;
	}
	@Override
	public int deleteBook(int bookId) throws Exception {

        int rowCount=0;
		try(Connection con = ds.getConnection();
				PreparedStatement psm = con.prepareStatement(DELETE_DATA)){
				
				psm.setInt(1, bookId);	
				rowCount = psm.executeUpdate();
				
			}
			catch(SQLException s) {
				throw s;
			}
			catch(Exception e) {
				throw e;
			}
			
			return rowCount;
	}
	@Override
	public int updateBook(Book b) throws Exception {
		int rowCount=0;
		try(Connection con = ds.getConnection();
			PreparedStatement psm = con.prepareStatement(UPDATE_DATA)){
			
			psm.setString(1, b.getTitle());
			psm.setString(2, b.getAuthor());
			psm.setDouble(3, b.getPrice());
			psm.setInt(4, b.getId());
			
			rowCount = psm.executeUpdate();
			
		}
		catch(SQLException s) {
			throw s;
		}
		catch(Exception e) {
			throw e;
		}
		
		return rowCount;
	}
	
	
}
