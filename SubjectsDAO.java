package dao;
import java.sql.SQLException;


import java.util.List;

import pojo.Subjects;
import jdbc.Database;

public interface SubjectsDAO<Subjects> {

	pojo.Subjects get(int id)  throws SQLException;
	List<Subjects> getAll() throws SQLException;
//	String save(Subjects subject);
//	int insert(Subjects subject);
//	int update(Subjects subject);
//	int delete(Subjects subject);
//	int STS(Subjects subject);
	
	
}
