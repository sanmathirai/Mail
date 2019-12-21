package com.ustglobal.mailbackend.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.mailbackend.dto.UserBean;

@Repository
public class ChangepasImpl implements ChangepasswDAO{
	
	@PersistenceUnit
	private EntityManagerFactory  factory;
	@Override
	public boolean changePassword(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
			Query query = manager.createQuery("update UserBean set password=:password where email=:email");
			query.setParameter("password", password);
			query.setParameter("email", email);
			try{
				transaction.begin();
				query.executeUpdate();
				transaction.commit();
		      	return true;
		}catch(Exception e){
			e.printStackTrace();
			return false; 
			
		}
		
		
	}
	
	
	

}
