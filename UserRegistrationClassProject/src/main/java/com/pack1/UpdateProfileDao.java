package com.pack1;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDao {
 public int updateProfile(UserBean ub) {
	 int rowCount=0;
	 try {
	 Connection con = DBConnect.getCon();
	 PreparedStatement psm = con.prepareStatement("update registration set FIRSTNAMR=?,LASTNAME=?,MAILID=?,phone=? where username=?");
	 psm.setString(1, ub.getUfname());
	 psm.setString(2, ub.getUlname());
	 psm.setString(3, ub.getUmail());
	 psm.setString(4, ub.getUphone());
	 psm.setString(5, ub.getUname());
	 rowCount = psm.executeUpdate();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return rowCount;
 }
}
