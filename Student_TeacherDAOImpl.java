package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Database;
import pojo.Student_Teacher;
import pojo.Subjects;

public class Student_TeacherDAOImpl implements Student_TeacherDAO{

	@Override
	public Student_Teacher get(int st_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=Database.getConnection();
		Student_Teacher s_t=null;
		
		String sql="SELECT * From students_teachers WHERE st_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, st_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int ost_id=rs.getInt("st_id");
			int teacher_id=rs.getInt("teacher_id");
			int student_id=rs.getInt("student_id");
			
			s_t=new Student_Teacher(ost_id,teacher_id,student_id);
		}
		
		 Database.closeResultSet(rs);
		 Database.closePreparedStatement(ps);
		 Database.closeConnection(con);
		
		return s_t;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM students_teachers";
		
		List<Student_Teacher> s_t = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int st_id = rs.getInt("st_id");
			int teacher_id = rs.getInt("teacher_id");
			int student_id = rs.getInt("student_id");
			
			
			Student_Teacher s_t2 = new Student_Teacher(st_id, teacher_id, student_id);
			
			s_t.add(s_t2);
		}
		
		return s_t;
	}

	@Override
	public int save(Object s_t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Student_Teacher s_t) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO students_teachers(st_id, teacher_id, student_id) VALUES (?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, s_t.getSt_id());
		ps.setInt(2, s_t.getTeacher_id());
		ps.setInt(3, s_t.getStudent_id());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		
		Database.closeConnection(con);
		
		return result;
	}

	@Override
	public int update(Student_Teacher s_t) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		
		String sql = "UPDATE students_teachers SET teacher_id = ?, student_id = ? WHERE st_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, s_t.getTeacher_id());
		ps.setInt(2, s_t.getStudent_id());
		ps.setInt(3, s_t.getSt_id());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return result;
	}

	@Override
	public int delete(Student_Teacher s_t) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM students_teachers WHERE st_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, s_t.getSt_id());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return result;
	}

	@Override
	public int STS3(Object s_t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
