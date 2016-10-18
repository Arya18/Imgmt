package com.inventory.common.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inventory.model.Product;
import com.inventory.model.ProductPurchaseInvoice;
import com.inventory.model.ProductSaleInvoice;

@Repository
public class DashboardDao {

	@Autowired
	SessionFactory sessionFactory;
	
	Session session = null;
	@SuppressWarnings("unused")
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<Product> findProductTypeByBrand(String brandName) {
		session = sessionFactory.openSession();
		
		@SuppressWarnings("unchecked")
		List<Product> products = session.createQuery("FROM Product WHERE brand=:bn").setParameter("bn",brandName).list();
			
		session.close();
		return products;	
		
	}

	public List<Product> findModelNumber(String brandName, String productType) {
		session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Product> products = session.createQuery("FROM Product WHERE brand=:bn AND productType=:pt").setParameter("bn",brandName).setParameter("pt",productType).list();
		
		session.close();
		return products;		
		}

	public List<Product> findSize(String brandName, String productType,
			String modelNumber) {
		session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Product> products = session.createQuery("FROM Product WHERE brand=:bn AND productType=:pt AND modelNumber=:mn").setParameter("bn",brandName).setParameter("pt",productType).setParameter("mn",modelNumber).list();
		
		session.close();
		return products;	
		}

	public List<Product> findproductInfo(String brandName, String productType,
			String modelNumber, String size) {
		session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Product> products = session.createQuery("FROM Product WHERE brand=:bn AND productType=:pt AND modelNumber=:mn AND size=:s").setParameter("bn",brandName).setParameter("pt",productType).setParameter("mn",modelNumber).
		setParameter("s", size).list();
		
		session.close();
		return products;
	}

	public void saveSID(ProductSaleInvoice sip) {
		Session session = sessionFactory.openSession();
		Transaction tx =session.beginTransaction();	
		session.save(sip);
		tx.commit();
		session.close();
	}

	public List<ProductSaleInvoice> findAllProductSaleInvoiceBySaleInvoiceid(long saleInvoiceNo) {
		session = sessionFactory.openSession();
		
		@SuppressWarnings("unchecked")
		List<ProductSaleInvoice> productSaleInvoices = session.createQuery("FROM ProductSaleInvoice WHERE saleinvoice=:SIN").setParameter("SIN",saleInvoiceNo).list();
			
		session.close();
		return productSaleInvoices;
	}

	public void savePurchaseInvoiceDetails(ProductPurchaseInvoice ppi) {
		Session session = sessionFactory.openSession();
		Transaction tx =session.beginTransaction();	
		session.save(ppi);
		tx.commit();
		session.close();
	}

	

}
