package Dao.porder;

import java.util.List;

import Model.porder;

public interface porderDao {
	//create新增
	void add(porder p);
	//read查詢
	List<porder> queryAll();
	List<porder> querySum(int start,int end);
	porder queryPorder(int id);
	//update修改
	void update(porder p);
	//delete刪除
	void delete(int id);

}
