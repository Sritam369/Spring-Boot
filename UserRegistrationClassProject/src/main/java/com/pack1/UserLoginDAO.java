package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO {
  public UserBean login(String uname,String pwd) {
	  UserBean ub =null;
	  try {
		  
	  Connection con = DBConnect.getCon();
	  PreparedStatement psm2 = con.prepareStatement("select * from registration where username=? and password=?");
	  psm2.setString(1, uname);
	  psm2.setString(2, pwd);
	  ResultSet rs = psm2.executeQuery();
	  
	  if(rs.next()) {
		  ub = new UserBean();
		  ub.setUname(rs.getString(1));
		  ub.setUpwd(rs.getString(2));
		  ub.setUfname(rs.getString(3));
		  ub.setUlname(rs.getString(4));
		  ub.setUmail(rs.getString(5));
		  ub.setUphone(rs.getString(6));
	  }
	  
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  return ub;
  }
}
