package Dao.member;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Dao.DbConnection;
import Model.member;
@SuppressWarnings("unchecked")
public class implMember implements memberDao{

	public static void main(String[] args) {
//		//add
//		member m = new member("ian","userIan","passIan","addIan","phoneIan","mobileIan");
//		new implMember().add(m);
//		//queryAll
//		List<member> l = new implMember().queryAll();
//		System.out.println("queryAll:");
//		for(member x:l)
//		{
//			System.out.println("name: "+x.getName());
//		}
//		//queryUsername
//		String username = "userIan";
//		System.out.println("Get username \""+username+"\" is: "+new implMember().queryUsername(username));
//		//queryMember id
//		int id = 1;
//		System.out.println("Get id \""+id+"\" is: "+new implMember().queryMember(id).getName());
//		//queryMember username password
//		String U = "userIan";
//		String P = "passIan";
//		System.out.println("Get username \""+U+"\" and"
//				+ "	password \""+P+"\" is: "+new implMember().queryMember(id).getName());
//		//update
//		
//		new implMember().update(null);
//		//delete
//		new implMember().delete(1);
	}

	@Override
	public void add(member m) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<member> queryAll() {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select m from member m";
		Query q = em.createQuery(JPQL);
		List<member> l = q.getResultList();
		return l;
	}

	@Override
	public boolean queryUsername(String username) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select m from member m where m.username=?1";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, username);
		List<member> l = q.getResultList();
		return l.size()>0;
	}

	@Override
	public member queryMember(int id) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select m from member m where m.id=?1";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, id);
		List<member> l = q.getResultList();
		return l.size()>0?l.get(0):null;
	}

	@Override
	public member queryMamber(String username, String password) {
		EntityManager em = DbConnection.getDb();
		String JPQL = "select m from member m where m.username=?1 and m.password=?2";
		Query q = em.createQuery(JPQL);
		q.setParameter(1, username);
		q.setParameter(2, password);
		List<member> l = q.getResultList();
		return l.size()>0?l.get(0):null;
	}

	@Override
	public void update(member m) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		em.merge(m);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(int id) {
		EntityManager em = DbConnection.getDb();
		em.getTransaction().begin();
		member m = em.find(member.class, id);
		em.remove(m);
		em.getTransaction().commit();
		em.close();
	}

}
