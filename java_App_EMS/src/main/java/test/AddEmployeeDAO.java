package test;
import java.sql.*;
public class AddEmployeeDAO {
public int k=0;
public int insert (EmployeeBean eb) {
	try {
		Connection con =DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement
		("insert into Employee values (?,?,?,?,?,?,?,?,?,?)");
	     
	    ps.setString(1, eb.geteId());
	    ps.setString(2, eb.geteName());
	    ps.setString(3, eb.geteDesg());
	    ps.setString(4, eb.geteCity());
	    ps.setString(5, eb.getmId());
	    ps.setLong(6, eb.getPhNo());
	    ps.setInt(7, eb.getbSal());
	    ps.setFloat(8, eb.getHra());
	    ps.setFloat(9, eb.getDa());
	    ps.setFloat(10, eb.getTotSal());
	    
	    k=ps.executeUpdate();
	    }catch(Exception e) {
		e.printStackTrace();
	}
	return k;
}
}
