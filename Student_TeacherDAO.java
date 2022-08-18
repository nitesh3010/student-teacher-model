package dao;

import java.sql.SQLException;
import java.util.List;

public interface Student_TeacherDAO<Student_Teacher> {

	pojo.Student_Teacher get(int st_id) throws SQLException;
	List<Student_Teacher> getAll() throws SQLException;
	int save(Student_Teacher s_t);
	int insert(pojo.Student_Teacher s_t) throws SQLException;
	int update(pojo.Student_Teacher s_t)throws SQLException;
	int delete(pojo.Student_Teacher s_t) throws SQLException;
	int STS3(Student_Teacher s_t);
	
}
