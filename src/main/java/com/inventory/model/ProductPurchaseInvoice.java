package com.inventory.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_supplier")
public class ProductPurchaseInvoice {
	
	public ProductPurchaseInvoice() {
		super();
	}

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "purchaseinvoice_id")
	private PurchaseInvoice purchaseInvoice;
	
	@Column(name = "quantity")
	private long quantity;
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name="discount_rate")
	private double discountRate;
	
	@Column(name="discounted_amount")
	private double discountedAmount;
	
	@Column(name="unit_price_before_discount")
	private double unitPriceBeforeDiscount;
	
	@Column(name="serialNo")
	private String serialNo;
	
	@Column(name="indoorSerialNo")
	private String indoorSerialNo;
	
	@Column(name="sale")
	private int sale;
	
	@Column(name="location")
	private String location;
	
	@Column(name="indoorsale")
	private int indoorsale;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	

	public PurchaseInvoice getPurchaseInvoice() {
		return purchaseInvoice;
	}

	public void setPurchaseInvoice(PurchaseInvoice purchaseInvoice) {
		this.purchaseInvoice = purchaseInvoice;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(double discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public double getUnitPriceBeforeDiscount() {
		return unitPriceBeforeDiscount;
	}

	public void setUnitPriceBeforeDiscount(double unitPriceBeforeDiscount) {
		this.unitPriceBeforeDiscount = unitPriceBeforeDiscount;
	}


	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIndoorSerialNo() {
		return indoorSerialNo;
	}

	public void setIndoorSerialNo(String indoorSerialNo) {
		this.indoorSerialNo = indoorSerialNo;
	}
	
	public ProductPurchaseInvoice(long id,String indoorSerialNo){
		this.id=id;
		this.indoorSerialNo=indoorSerialNo;
	}

	public int getIndoorsale() {
		return indoorsale;
	}

	public void setIndoorsale(int indoorsale) {
		this.indoorsale = indoorsale;
	}
	
	
	
}





















