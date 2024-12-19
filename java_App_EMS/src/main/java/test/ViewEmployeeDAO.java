package test;
import java.util.*;
import java.sql.*;
public class ViewEmployeeDAO 
{
  public ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
  public ArrayList<EmployeeBean> retrieve()
  {
	  try {
		   Connection con=DBConnection.getCon();
		   PreparedStatement ps=con.prepareStatement
		   ("select * from employee");
		   ResultSet rs=ps.executeQuery();
		   while(rs.next()) {
			   EmployeeBean eb=new EmployeeBean();
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
			   al.add (eb);
		       }
		   
	  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  return al;
  }
}
