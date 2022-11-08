package Dao.porder;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dao.DbConnection;
import Model.porder;
@SuppressWarnings("unchecked")
public class implPorder implements porderDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(porder p) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<porder> queryAll() {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select p from porder p";
		Query q = em.createQuery(JPQL);
		List<porder> l = q.getResultList();
		return l;
	}

	@Override
	public List<porder> querySum(int start, int end) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select p from porder p where p.sum>=?1 and p.sum<=?2";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, start);
		q.setParameter(2, end);
		List<porder> l = q.getResultList();
		return l;
	}

	@Override
	public void update(porder p) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(int id) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		porder p = em.find(porder.class, id);
		em.remove(p);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public porder queryPorder(int id) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select p from porder p where p.id=?1";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, id);
		
		List<porder> l = q.getResultList();
		return l.size()>0?l.get(0):null;
	}

}
