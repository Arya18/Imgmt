package com.inventory.common.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inventory.model.Admin;
import com.inventory.model.Checker;
import com.inventory.model.Maker;
import com.inventory.model.SalesPerson;

@Repository
public class PreLoginDao {
	@Autowired
	SessionFactory sessionFactory;

	Session session = null;

	public Admin checkAdminDetails(String email, String password) {
		
			Session session;
			Admin  admin = null;
			try{
				session = sessionFactory.openSession();
				Criteria criteria = session.createCriteria(Admin.class);
				 criteria.add(Restrictions.eq("email", email));
				 criteria.add(Restrictions.eq("password", password));
				 Object result=criteria.uniqueResult();
				 admin = (Admin)result;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return admin;
		}

	public Checker checkCheckerDetails(String email, String password) {
		Session session;
		Checker  checker = null;
		try{
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Checker.class);
			 criteria.add(Restrictions.eq("email", email));
			 criteria.add(Restrictions.eq("password", password));
			 Object result=criteria.uniqueResult();
			 checker = (Checker)result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return checker;	
		}

	public Maker checkMakerDetails(String email, String password) {
		Session session;
		Maker maker = null;
		try{
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Maker.class);
			 criteria.add(Restrictions.eq("email", email));
			 criteria.add(Restrictions.eq("password", password));
			 Object result=criteria.uniqueResult();
			 maker = (Maker)result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return maker;
	}

	public SalesPerson checkSalesPersonDetails(String email, String password) {
		Session session;
		SalesPerson salesPerson = null;
		try{
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(SalesPerson.class);
			 criteria.add(Restrictions.eq("email", email));
			 criteria.add(Restrictions.eq("password", password));
			 Object result=criteria.uniqueResult();
			 salesPerson = (SalesPerson)result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return salesPerson;	
		
	}
	

}
