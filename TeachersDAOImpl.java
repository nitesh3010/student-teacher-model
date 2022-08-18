package dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Database;
import pojo.Teachers;

public class TeachersDAOImpl implements TeachersDAO{

	@Override
	public Teachers get(int t_id) throws SQLException{
		// TODO Auto-generated method stub
		
		Connection con=Database.getConnection();
		Teachers teacher = null;
		
		String sql="SELECT * From teachers WHERE t_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, t_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int ot_id=rs.getInt("t_id");
			String first_name=rs.getString("first_name");
			String last_name=rs.getString("last_name");
			long phone=rs.getLong("phone");
			String email_id=rs.getString("email_id");
			int subject_id=rs.getInt("subject_id");
			
			teacher = new Teachers(ot_id,first_name,last_name,phone,email_id,subject_id);
		}
		
		 Database.closeResultSet(rs);
		 Database.closePreparedStatement(ps);
		 Database.closeConnection(con);
		 
		return teacher;
	}

	@Override
	public List getALL() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=Database.getConnection();
		String sql="SELECT * FROM teachers";
		
		List<Teachers> teacher=new ArrayList<>();
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			int ot_id=rs.getInt("t_id");
			String first_name=rs.getString("first_name");
			String last_name=rs.getString("last_name");
			long phone=rs.getLong("phone");
			String email_id=rs.getString("email_id");
			int subject_id=rs.getInt("subject_id");
			
			Teachers teachers = new Teachers(ot_id,first_name,last_name,phone,email_id,subject_id); 
			teacher.add(teachers);
		}
		
		
		return teacher;
	}

//	@Override
//	public int save(Object teacher) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int insert(Object teacher) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public int update(Teachers teacher) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		
		String sql = "UPDATE teachers SET first_name = ?, last_name = ?, phone = ?, email_id = ?, subject_id = ? WHERE t_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, teacher.getFirst_name());
		ps.setString(2, teacher.getLast_name());
		ps.setLong(3, teacher.getPhone());
		ps.setString(4, teacher.getEmail_id());
		ps.setInt(5, teacher.getSubject_id());
		ps.setInt(6, teacher.getT_id());

		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return result;
		
		
	}

//	@Override
//	public int delete(Object teacher) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public int STS2(Object teacher) {
		// TODO Auto-generated method stub
		return 0;
	}

}
