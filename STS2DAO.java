package dao;

import java.sql.SQLException;
import java.util.List;

public interface STS2DAO<STS2> {
	pojo.STS2 get(int s_id)  throws SQLException;
	List<STS2> getAll() throws SQLException;
}
