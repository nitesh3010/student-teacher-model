package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Database;
import pojo.Grades;
import pojo.Subjects;

public class GradesDAOImpl implements GradesDAO{

	@Override
	public Grades get(int g_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=Database.getConnection();
		Grades grade = null;
		
		String sql="SELECT * From grades WHERE g_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, g_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int og_id=rs.getInt("g_id");
			String grade1=rs.getString("grade");
			
			grade=new Grades(og_id,grade1);
		}
		
		Database.closeResultSet(rs);
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return grade;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM grades";
		
		List<Grades> grade = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int g_id = rs.getInt("g_id");
			String gradex = rs.getString("grade");
			
			
			Grades grades = new Grades(g_id, gradex);
			
			grade.add(grades);
		}
		
		return grade;
	}

	@Override
	public int save(Object grade) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int insert(Object grade) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int update(Object grade) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int delete(Object grade) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int STS5(Object grade) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
