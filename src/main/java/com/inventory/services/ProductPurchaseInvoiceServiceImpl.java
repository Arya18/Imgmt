package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inventory.DTO.AdminDTO;
import com.inventory.dao.ProductPurchaseInvoiceDao;
import com.inventory.model.ProductPurchaseInvoice;

@Service
@Transactional(rollbackFor=Exception.class)
public class ProductPurchaseInvoiceServiceImpl implements ProductPurchaseInvoiceService{
@Autowired ProductPurchaseInvoiceDao productPurchaseInvoiceDao;

@Override
public ProductPurchaseInvoice getProductPurchaseInvoiceBySerialNo(String serialNo){
		return productPurchaseInvoiceDao.getProductPurchaseInvoiceBySerialNo(serialNo);
}

@Override
public List<ProductPurchaseInvoice> getProductByProductId(long id) {
	return productPurchaseInvoiceDao.getProductByProductId(id);
}

@Override
public boolean addOrUpdateProductPurchaseinvoice(ProductPurchaseInvoice ppi) {
	return productPurchaseInvoiceDao.addOrUpdateProductPurchaseinvoice(ppi);
}

@Override
public List<ProductPurchaseInvoice> getIndoorSerialNoByProductId(long id) {
	return productPurchaseInvoiceDao.getIndoorSerialNoByProductId(id);
}

@Override
public ProductPurchaseInvoice getProductPurchaseInvoiceByIndoorSerialNo(
		String indoorserialNo) {
	return productPurchaseInvoiceDao.getProductPurchaseInvoiceByIndoorSerialNo(indoorserialNo);
}

@Override
public ProductPurchaseInvoice findProductPurchaseInvoiceBySerialNo(
		String serialNumber) {
	return productPurchaseInvoiceDao.findProductPurchaseInvoiceBySerialNo(serialNumber);
}

@Override
public ProductPurchaseInvoice findProductPurchaseInvoiceByIndoorSerialNo(
		String indoorSerialNumber) {
	// TODO Auto-generated method stub
	return productPurchaseInvoiceDao.findProductPurchaseInvoiceByIndoorSerialNo(indoorSerialNumber);
}

@Override
public ProductPurchaseInvoice findProductPurchaseInvoiceById(
		long productPurchaseInvoiceId) {
	return productPurchaseInvoiceDao.findProductPurchaseInvoiceById(productPurchaseInvoiceId);
}

@Override
public List<ProductPurchaseInvoice> getAllProductByProductId(long productId){
	return productPurchaseInvoiceDao.getAllProductByProductId(productId);
}

}
