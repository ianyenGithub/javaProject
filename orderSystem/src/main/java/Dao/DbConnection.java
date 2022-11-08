package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {
	public static void main(String[] args)
	{
		new DbConnection();
		System.out.println(DbConnection.getDb());//測試連線
	}
	public static EntityManager getDb()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("orderSys");
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
