package com.inventory.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.model.Admin;
import com.inventory.model.CustomerReport;
import com.inventory.model.SaleInvoice;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class SaleInvoiceDaoImpl implements SaleInvoiceDao{

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addOrUpdateSaleInvoice(SaleInvoice saleInvoice) {
		boolean flag = false;
	    try{    
	    	session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.saveOrUpdate(saleInvoice);
			tx.commit();
			session.close();
			flag = true;
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		return flag;	
	}

	@Override
	public List<SaleInvoice> getSaleInvoiceList() {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		
		Criteria c = session.createCriteria(SaleInvoice.class);

		List<SaleInvoice> saleInvoiceList = c.list();
		tx.commit();
		session.close();
		return saleInvoiceList;
	}

	@Override
	public SaleInvoice getSaleInvoiceById(long saleinvoiceNo) {
		Session session=null;
		SaleInvoice  saleInvoice = null;
		try{
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(SaleInvoice.class);
			 criteria.add(Restrictions.eq("saleInvoiceNo", saleinvoiceNo));
			 Object result=criteria.uniqueResult();
			 saleInvoice = (SaleInvoice)result;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		return saleInvoice;
	}
}
