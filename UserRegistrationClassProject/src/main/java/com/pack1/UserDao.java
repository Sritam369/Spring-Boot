package com.pack1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

public class UserDao {
  
  public int insertData(UserBean ub) {
	  Connection con = DBConnect.getCon();
	  int rowCount=0;
	  try {
		  PreparedStatement psm1 = con.prepareStatement("insert into registration values(?,?,?,?,?,?)");
		  psm1.setString(1, ub.getUname());
		  psm1.setString(2, ub.getUpwd());
		  psm1.setString(3,ub.getUfname());
		  psm1.setString(4, ub.getUlname());
		  psm1.setString(5, ub.getUmail());
		  psm1.setString(6, ub.getUphone());
		  rowCount = psm1.executeUpdate();
	  }
	  catch(Exception e) {
		  if(e instanceof SQLIntegrityConstraintViolationException) {
			  System.out.println("Duplicate user name not allowed");
		  }
		  e.printStackTrace();
	  }
	  
	  return rowCount;
  }
}
