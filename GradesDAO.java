package dao;

import java.sql.SQLException;
import java.util.List;

public interface GradesDAO<Grades> {

	pojo.Grades get(int g_id) throws SQLException;
	List<Grades> getAll() throws SQLException;
	int save(Grades grade);
//	int insert(Grades grade);
//	int update(Grades grade);
//	int delete(Grades grade);
//	int STS5(Grades grade);
	
}
