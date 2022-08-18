package dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.Subjects;
import jdbc.Database;
import test.test;

public class SubjectsDAOImpl implements SubjectsDAO{

	@Override
	public Subjects get(int id) throws SQLException{
		// TODO Auto-generated method stub
		
		Connection con = Database.getConnection();
		Subjects subject = null;
		
		String sql = "SELECT * From subjects WHERE id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int oid = rs.getInt("id");
			String subject_name = rs.getString("subject_name");
			
			subject=new Subjects(oid,subject_name);
		}
		
		 Database.closeResultSet(rs);
		 Database.closePreparedStatement(ps);
		 Database.closeConnection(con);
		 
		return subject;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM subjects order by id";
		
		List<Subjects> subject = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String subject_name = rs.getString("subject_name");
			
			
			Subjects subjects = new Subjects(id, subject_name);
			
			subject.add(subjects);
		}
		
		return subject;
	}

//	@Override
//	public int save(Object subject) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int insert(Object subject) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int update(Object subject) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int delete(Object subject) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int STS(Object subject) {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	}

	
	
}
