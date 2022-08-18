package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Database;
import pojo.STS2;
import pojo.STS3;

public class STS3DAOImpl implements STS3DAO{

	@Override
	public STS3 get(int st_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		STS3 sts3 = null;
		
		String sql = "select st.st_id,te.t_id,te.first_name,te.last_name,te.phone,te.email_id,sub.subject_name,su.s_id,su.first_name,su.last_name,su.phone,su.email_id,g.grade\r\n"
				+ "from students_teachers st \r\n"
				+ "inner join teachers te \r\n"
				+ "on st.teacher_id = te.t_id inner join subjects sub on te.subject_id = sub.id\r\n"
				+ "inner join students su \r\n"
				+ "on st.student_id = su.s_id inner join grades g on su.grade_id = g.g_id where st.st_id = ?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, st_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int ost_id = rs.getInt("st.st_id");
			int t_id = rs.getInt("t_id");
			String first_name = rs.getString("te.first_name");
			String  last_name = rs.getString("te.last_name");
			long phone = rs.getLong("te.phone");
			String email_id = rs.getString("te.email_id");
			String subject_name = rs.getString("sub.subject_name");
			int s_id = rs.getInt("su.s_id");
			String first_name2 = rs.getString("su.first_name");
			String last_name2 = rs.getString("su.last_name");
			long phone2 = rs.getLong("su.phone");
			String email_id2 = rs.getString("su.email_id");
			String grade = rs.getString("g.grade");
			
			sts3=new STS3(ost_id, t_id, first_name, last_name, phone, email_id, subject_name, s_id, first_name2, last_name2, phone2, email_id2, grade);
		}
		
		 Database.closeResultSet(rs);
		 Database.closePreparedStatement(ps);
		 Database.closeConnection(con);
		 
		return sts3;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "select st.st_id,te.t_id,te.first_name,te.last_name,te.phone,te.email_id,sub.subject_name,su.s_id,su.first_name,su.last_name,su.phone,su.email_id,g.grade\r\n"
				+ "from students_teachers st \r\n"
				+ "inner join teachers te \r\n"
				+ "on st.teacher_id = te.t_id inner join subjects sub on te.subject_id = sub.id\r\n"
				+ "inner join students su \r\n"
				+ "on st.student_id = su.s_id inner join grades g on su.grade_id = g.g_id;";
		
		List<STS3> sts3 = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int ost_id = rs.getInt("st.st_id");
			int t_id = rs.getInt("t_id");
			String first_name = rs.getString("te.first_name");
			String  last_name = rs.getString("te.last_name");
			long phone = rs.getLong("te.phone");
			String email_id = rs.getString("te.email_id");
			String subject_name = rs.getString("sub.subject_name");
			int s_id = rs.getInt("su.s_id");
			String first_name2 = rs.getString("su.first_name");
			String last_name2 = rs.getString("su.last_name");
			long phone2 = rs.getLong("su.phone");
			String email_id2 = rs.getString("su.email_id");
			String grade = rs.getString("g.grade");
			
			STS3 sts3s=new STS3(ost_id, t_id, first_name, last_name, phone, email_id, subject_name, s_id, first_name2, last_name2, phone2, email_id2, grade);
			
			sts3.add(sts3s);
		}
		
		return sts3;
	}

}
