package test;
import java.sql.*;
public class UpdateEmployeeDAO {
public int k=0;
public int Update(EmployeeBean eb) {
	try {
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement
("update employee set edesg=?,ecity=?,mid=?,phno=?,bsal=?,hra=?,da=?,totsal=? where eid=?");
		ps.setString(1,eb.geteDesg());
		ps.setString(2, eb.geteCity());
		ps.setString(3, eb.getmId());
		ps.setLong(4, eb.getPhNo());
		ps.setInt(5, eb.getbSal());
		ps.setFloat(6, eb.getHra());
		ps.setFloat(7, eb.getDa());
		ps.setFloat(8, eb.getTotSal());
		ps.setString(9, eb.geteId());
        k=ps.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return k;
}
}
