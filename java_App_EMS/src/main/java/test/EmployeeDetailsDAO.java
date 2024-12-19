package test;
import java.sql.*;
import java.util.*;
public class EmployeeDetailsDAO{
	public ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
	public ArrayList<EmployeeBean> retrieve(EmployeeBean eb1){
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("select * from employee where eid=?");
			ps.setString(1,eb1.geteId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				eb1=new EmployeeBean();
				eb1.seteId(rs.getString(1));
				eb1.seteName(rs.getNString(2));
				eb1.seteDesg(rs.getString(3));
				eb1.seteCity(rs.getString(4));
				eb1.setmId(rs.getString(5));
				eb1.setPhNo(rs.getLong(6));
				eb1.setbSal(rs.getInt(7));
				eb1.setHra(rs.getFloat(8));
				eb1.setDa(rs.getFloat(9));
				eb1.setTotSal(rs.getFloat(10));
				al.add(eb1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	return al;
	}
}
