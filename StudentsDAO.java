package dao;

import java.sql.SQLException;
import java.util.List;

public interface StudentsDAO<Students> {

	pojo.Students get(int s_id) throws SQLException;
	List<Students> getAll() throws SQLException;
	int save(Students student);
	int insert(pojo.Students student)throws SQLException;
	int update(pojo.Students student) throws SQLException;
	int delete(pojo.Students student) throws SQLException;
	int STS4(Students student);
	
}
