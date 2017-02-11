package com.inventory.DTO;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.inventory.model.Product;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SaleInvoiceProductDTO {

	private String invoiceNumber;
	private double totalDiscount;
	private double finalAmount;
	private String customerName;
	private String customerContact;
	private String customerAddress;
	private String customerEmail;
	private String paymentMode;
	private double amountPaid;
	private double balanceLeft;
	private String comments="ok";
	private Date date;
	
	List<ProductDTO> productsArray;
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	
	public List<ProductDTO> getProductsArray() {
		return productsArray;
	}
	public void setProductsArray(List<ProductDTO> productsArray) {
		this.productsArray = productsArray;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public double getBalanceLeft() {
		return balanceLeft;
	}
	public void setBalanceLeft(double balanceLeft) {
		this.balanceLeft = balanceLeft;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
