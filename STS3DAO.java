package dao;

import java.sql.SQLException;
import java.util.List;

public interface STS3DAO<STS3> {
	pojo.STS3 get(int st_id)  throws SQLException;
	List<STS3> getAll() throws SQLException;
}
