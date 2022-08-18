package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Database;
import pojo.Students;
import pojo.Subjects;

public class StudentsDAOImpl implements StudentsDAO{

	@Override
	public Students get(int s_id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=Database.getConnection();
		Students student = null;
		
		String sql="SELECT * From students WHERE s_id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s_id);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			int os_id=rs.getInt("s_id");
			String first_name=rs.getString("first_name");
			String last_name=rs.getString("last_name");
			long phone=rs.getLong("phone");
			String email_id=rs.getString("email_id");
			int grade_id=rs.getInt("grade_id");
			
			student=new Students(os_id,first_name,last_name,phone,email_id,grade_id);
		}
		
		Database.closeResultSet(rs);
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return student;
	}

	@Override
	public List getAll() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM students";
		
		List<Students> student = new ArrayList<>();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int s_id = rs.getInt("s_id");
			String first_name = rs.getString("first_name");
			String last_name = rs.getString("last_name");
			long phone = rs.getLong("phone");
			String email_id = rs.getString("email_id");
			int grade_id = rs.getInt("grade_id");
			
			
			Students students = new Students(s_id, first_name, last_name, phone, email_id, grade_id);
			
			student.add(students);
		}
		
		return student;
	}

	@Override
	public int save(Object student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Students student) throws SQLException {
		// TODO Auto-generated method stub
Connection con = Database.getConnection();
		
		String sql = "INSERT INTO students(s_id, first_name, last_name, phone, email_id, grade_id) VALUES (?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, student.getS_id());
		ps.setString(2, student.getFirst_name());
		ps.setString(3, student.getLast_name());
		ps.setLong(4, student.getPhone());
		ps.setString(5, student.getEmail_id());
		ps.setInt(6, student.getGrade_id());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		
		Database.closeConnection(con);
		
		return result;
	}

	@Override
	public int update(Students student) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		
		String sql = "UPDATE students SET first_name = ?, last_name = ?, phone = ?, email_id = ?, grade_id = ? WHERE s_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, student.getFirst_name());
		ps.setString(2, student.getLast_name());
		ps.setLong(3, student.getPhone());
		ps.setString(4, student.getEmail_id());
		ps.setInt(5, student.getGrade_id());
		ps.setInt(6, student.getS_id());

		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return result;
	}

	@Override
	public int delete(Students student) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM students WHERE s_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, student.getS_id());
		
		int result = ps.executeUpdate();
		
		Database.closePreparedStatement(ps);
		Database.closeConnection(con);
		
		return result;
	}

	@Override
	public int STS4(Object student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
