package dao;

import java.sql.SQLException;
import java.util.List;

public interface TeachersDAO<Teachers> {

	pojo.Teachers get(int t_id) throws SQLException ;
	List<Teachers> getALL() throws SQLException;
//	int save(Teachers teacher);
//	int insert(Teachers teacher);
	int update(pojo.Teachers teacher) throws SQLException;
//	int delete(Teachers teacher);
	int STS2(Teachers teacher);
	
	
}
