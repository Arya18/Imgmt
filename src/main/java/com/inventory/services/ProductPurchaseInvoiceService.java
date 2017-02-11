package com.inventory.services;

import java.util.List;

import com.inventory.model.ProductPurchaseInvoice;

public interface ProductPurchaseInvoiceService {
	ProductPurchaseInvoice getProductPurchaseInvoiceBySerialNo(String serialno);

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
