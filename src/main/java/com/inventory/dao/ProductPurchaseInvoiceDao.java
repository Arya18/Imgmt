package com.inventory.dao;

import java.util.List;

import com.inventory.model.ProductPurchaseInvoice;

public interface ProductPurchaseInvoiceDao {

	ProductPurchaseInvoice getProductPurchaseInvoiceBySerialNo(String serialNo);

	List<ProductPurchaseInvoice> getProductByProductId(long id);

	boolean addOrUpdateProductPurchaseinvoice(ProductPurchaseInvoice ppi);

	List<ProductPurchaseInvoice> getIndoorSerialNoByProductId(long id);

	ProductPurchaseInvoice getProductPurchaseInvoiceByIndoorSerialNo(
			String indoorserialNo);

	ProductPurchaseInvoice findProductPurchaseInvoiceBySerialNo(
			String serialNumber);

	ProductPurchaseInvoice findProductPurchaseInvoiceByIndoorSerialNo(
			String indoorSerialNumber);

	ProductPurchaseInvoice findProductPurchaseInvoiceById(
			long productPurchaseInvoiceId);

	List<ProductPurchaseInvoice> getAllProductByProductId(long productId);

}
