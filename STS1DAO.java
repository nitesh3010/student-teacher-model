package dao;

import java.sql.SQLException;
import java.util.List;

public interface STS1DAO<STS1> {
	pojo.STS1 get(int t_id)  throws SQLException;
	List<STS1> getAll() throws SQLException;
}
