package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Database;
import pojo.STS1;
import pojo.STS2;

public class STS2DAOImpl implements STS2DAO{

	@Override
	public STS2 get(int s_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		STS2 sts2 = null;
		
		String sql = "select s.s_id,s.first_name,s.last_name,s.phone,s.email_id,g.grade from students s inner join grades g on s.grade_id = g.g_id where  s.s_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int os_id = rs.getInt("s.s_id");
			String first_name = rs.getString("s.first_name");
			String last_name = rs.getString("s.last_name");
			long phone = rs.getLong("s.phone");
			String email_id = rs.getString("s.email_id");
			String grade = rs.getString("g.grade");
			
			sts2=new STS2(os_id, first_name, last_name, phone, email_id, grade);
		}
		
		 Database.closeResultSet(rs);
		 Database.closePreparedStatement(ps);
		 Database.closeConnection(con);
		 
		return sts2;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "select s.s_id,s.first_name,s.last_name,s.phone,s.email_id,g.grade from students s inner join grades g on s.grade_id = g.g_id";
		
		List<STS2> sts2 = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int os_id = rs.getInt("s.s_id");
			String first_name = rs.getString("s.first_name");
			String last_name = rs.getString("s.last_name");
			long phone = rs.getLong("s.phone");
			String email_id = rs.getString("s.email_id");
			String grade = rs.getString("g.grade");
			
			STS2 sts2s=new STS2(os_id, first_name, last_name, phone, email_id, grade);
			
			sts2.add(sts2s);
		}
		
		return sts2;
	}

}
