package com.inventory.dao;

import java.math.BigInteger;
import java.util.List;

import com.inventory.model.PurchaseInvoice;

public interface PurchaseInvoiceDao {

	boolean addOrUpdatePurchaseInvoice(PurchaseInvoice purchaseInvoice);
	PurchaseInvoice getPurchaseInvoiceById(long purchaseInvoiceId);
	List<PurchaseInvoice> getPurchaseList();
	boolean deletePurchaseInvoice(long purchaseInvoiceNo);
	PurchaseInvoice verifyPurchaseInvoice(long purchaseInvoiceNo,boolean verify);
	PurchaseInvoice getPurchaseInvoiceBySupplierReportId(long supplierReportId);
	PurchaseInvoice getpurchaseInvoiceByInvoiceNumber(
			String purchaseInvoiceNumber);
	BigInteger paymentDueCountOfSuppliers();
	List<PurchaseInvoice> getAllDuePurchaseInvoice();
}
