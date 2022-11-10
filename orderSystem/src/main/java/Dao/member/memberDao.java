package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {
	//C
	void add(member m);
	//R
	List<member> queryAll();
	boolean queryUsername(String username);
	member queryMember(int id);
	member queryMember(String username, String password);
	//U
	void update(member m);
	//D
	void delete(int id);
}
