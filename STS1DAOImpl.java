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
import pojo.Subjects;

public class STS1DAOImpl implements STS1DAO{

	@Override
	public STS1 get(int t_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		STS1 sts1 = null;
		
		String sql = "select t.t_id,t.first_name,t.last_name,t.phone,t.email_id,s.subject_name from teachers t inner join subjects s on t.subject_id = s.id where t.t_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, t_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int ot_id = rs.getInt("t.t_id");
			String first_name = rs.getString("t.first_name");
			String last_name = rs.getString("t.last_name");
			long phone = rs.getLong("t.phone");
			String email_id = rs.getString("t.email_id");
			String subject_name = rs.getString("s.subject_name");
			
			sts1=new STS1(ot_id, first_name, last_name, phone, email_id, subject_name);
		}
		
		 Database.closeResultSet(rs);
		 Database.closePreparedStatement(ps);
		 Database.closeConnection(con);
		 
		return sts1;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "select s.id,t.first_name,t.last_name,t.phone,t.email_id,s.subject_name from teachers t inner join subjects s on t.subject_id = s.id";
		
		List<STS1> sts1 = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int oid = rs.getInt("s.id");
			String first_name = rs.getString("t.first_name");
			String last_name = rs.getString("t.last_name");
			long phone = rs.getLong("t.phone");
			String email_id = rs.getString("t.email_id");
			String subject_name = rs.getString("s.subject_name");
			
			
			STS1 sts1s = new STS1(oid, first_name, last_name, phone, email_id, subject_name);
			
			sts1.add(sts1s);
		}
		
		return sts1;
	}

}
