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
@Table(name="product_saleinvoice")
public class ProductSaleInvoice {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "saleinvoice_id")
	private SaleInvoice saleinvoice;
	private String comment;
	
	@Column(name = "quantity")
	private long quantity;
	@Column(name = "unitPrice")
	private double unitPrice;
	
	@Column(name="discountRate")
	private double discountRate;
	
	
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
	
	
	public SaleInvoice getSaleinvoice() {
		return saleinvoice;
	}
	public void setSaleinvoice(SaleInvoice saleinvoice) {
		this.saleinvoice = saleinvoice;
	}
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
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
	
	
	
}
