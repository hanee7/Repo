package test;
import java.sql.*;
public class EmployeeLoginDAO {
public EmployeeBean eb=null;
public EmployeeBean Login(String eid)
{
	try {
	Connection con=DBConnection.getCon();
	PreparedStatement ps=con.prepareStatement
	("select * from employee where eid=?");
	ps.setString(1,eid);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
	    eb=new EmployeeBean();
		eb.seteId(rs.getString(1));
		eb.seteName(rs.getString(2));
		eb.seteDesg(rs.getString(3));
		eb.seteCity(rs.getString(4));
		eb.setmId(rs.getString(5));
		eb.setPhNo(rs.getLong(6));
		eb.setbSal(rs.getInt(7));
		eb.setHra(rs.getFloat(8));
		eb.setDa(rs.getFloat(9));
		eb.setTotSal(rs.getFloat(10));
	
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	}return eb;
}

}
