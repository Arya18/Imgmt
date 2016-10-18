package com.inventory.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inventory.DTO.ProductDTO;
import com.inventory.DTO.PurchaseinvoiceProductDTO;
import com.inventory.DTO.SaleInvoiceProductDTO;
import com.inventory.common.service.DashboardService;
import com.inventory.model.Admin;
import com.inventory.model.Checker;
import com.inventory.model.Customer;
import com.inventory.model.CustomerReport;
import com.inventory.model.Maker;
import com.inventory.model.Product;
import com.inventory.model.ProductPurchaseInvoice;
import com.inventory.model.ProductSaleInvoice;
import com.inventory.model.PurchaseInvoice;
import com.inventory.model.SaleInvoice;
import com.inventory.model.SalesPerson;
import com.inventory.model.StockReport;
import com.inventory.model.Supplier;
import com.inventory.model.TaxInvoice;
import com.inventory.services.AdminServices;
import com.inventory.services.CheckerServices;
import com.inventory.services.CustomerReportServices;
import com.inventory.services.CustomerServices;
import com.inventory.services.MakerServices;
import com.inventory.services.ProductServices;
import com.inventory.services.PurchaseInvoiceServices;
import com.inventory.services.SaleInvoiceServices;
import com.inventory.services.SalesPersonServices;
import com.inventory.services.StockReportServices;
import com.inventory.services.SupplierServices;
import com.inventory.services.TaxInvoiceServices;
import com.inventory.utility.CommonUtils;
import com.inventory.utility.SessionUser;

@Controller
@RequestMapping(value="/dashboard")
public class DashboardController extends BaseController {
	@Autowired DashboardService dashboardService;
	@Autowired SaleInvoiceServices saleInvoiceServices;
	@Autowired ProductServices productServices;
	@Autowired CheckerServices checkerServices;
	@Autowired AdminServices adminServices;
	@Autowired CustomerServices customerService;
	@Autowired TaxInvoiceServices taxInvoiceServices;
	@Autowired CustomerReportServices customerReportServices;
	@Autowired SalesPersonServices salesPersonServices;
	@Autowired MakerServices makerServices;
	@Autowired SupplierServices supplierServices;
	@Autowired StockReportServices stockReportServices;
	@Autowired PurchaseInvoiceServices purchaseInvoiceServices;
	

	@RequestMapping(value="/createUsers",method=RequestMethod.GET)
	public String createUsers(){
		 return "create-users";
	}
	
	@RequestMapping(value="/createUsers",method=RequestMethod.POST)
	public String saveuser(Model model,HttpSession httpSession,@RequestParam(value="email") String email,@RequestParam(value="password") String password,@RequestParam(value="role") String role,
			@RequestParam(value="username") String username,@RequestParam(value="status") String status){
		
		if(email==null|| username==null || role==null || status==null || password==null ||email.trim().length()==0 || password.trim().length()==0 || email.trim().length()==0 || status.trim().length()==0 
				||role.trim().length()==0){
			setError(model, "Inputs files email or password or username or role or status cannot be null");
			return "create-users";
		}
		System.out.println("status"+status);
		try{
			SessionUser sessionUser=SessionUser.getHttpSessionUser(httpSession);
			Admin admin=adminServices.getAdminById(sessionUser.getId());
		
			String passwordinMD5=CommonUtils.getMD5(password);
		
		if(role.equalsIgnoreCase("Maker")){
			Maker maker=new Maker();
			maker.setEmail(email);
			maker.setPassword(passwordinMD5);
			maker.setUsername(username);
			maker.setName(username);
			maker.setAdmin(admin);
			maker.setUserRole(role);
			
			maker.setStatus(0);
			if(status.equalsIgnoreCase("active")){
				maker.setStatus(1);
			}
			makerServices.addOrUpdateMaker(maker);
		}
		
		if(role.equalsIgnoreCase("Checker")){
			Checker checker=new Checker();
			checker.setEmail(email);
			checker.setPassword(passwordinMD5);
			checker.setUsername(username);
			checker.setName(username);
			checker.setAdmin(admin);
			checker.setUserRole(role);
			checker.setStatus(0);
			if(status.equalsIgnoreCase("active")){
			checker.setStatus(1);
			}
			checkerServices.addOrUpdateChecker(checker);
		}
		if(role.equalsIgnoreCase("Sales Person")){
			SalesPerson salePerson=new SalesPerson();
			salePerson.setEmail(email);
			salePerson.setPassword(passwordinMD5);
			salePerson.setUsername(username);
			salePerson.setName(username);
			salePerson.setAdmin(admin);
			salePerson.setUserRole(role);
			
			salePerson.setStatus(0);
			if(status.equalsIgnoreCase("active")){
				salePerson.setStatus(1);
			}
			salesPersonServices.addOrUpdateSalesPerson(salePerson);
		}
		}
		catch(Exception e){
			setUnknownError(model);
		}
		model.addAttribute("Update_Msg", true);
		 return "create-users";
	}
	
	@RequestMapping(value="/customerReport",method=RequestMethod.GET)
	public String customerReport(){
		 return "customer-report";
	}
	
	@RequestMapping(value="/salesinvoice",method=RequestMethod.GET)
	public String salesInvoice(){
		return "sales-invoice";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model,HttpServletRequest request){
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("HTTP_SESSION_USER", null);
		httpSession.invalidate();
		return "login";
	}
	
	@RequestMapping(value="/getproductType/{brandName}",method=RequestMethod.GET)
	@ResponseBody public ResponseEntity<Map<String, Object>> getProductType(@PathVariable(value="brandName") String brandName){
			
			Map<String, Object> responseMap = new HashMap<String, Object>(2);
			responseMap.put("exists", false);
			responseMap.put("brandName", null);
			
			try{
				List<Product> products= dashboardService.findProductTypeByBrand(brandName);
				if(!products.isEmpty()){
					responseMap.put("exists", true);
					Set<String> productType=new HashSet<String>();
					for (Product p : products) {
						productType.add(p.getProductType());
					}
					responseMap.put("brandName", productType);
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
				responseMap.remove("exists");
				responseMap.put("brandName", "Some error occured.");
				return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.BAD_REQUEST);
	}
			return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.OK);
}
	
	@RequestMapping(value="/getModelNumber/{brandName}/{productType}",method=RequestMethod.GET)
	@ResponseBody public ResponseEntity<Map<String, Object>> getModelNumber(@PathVariable(value="brandName") String brandName,@PathVariable(value="productType") String productType){
			
			Map<String, Object> responseMap = new HashMap<String, Object>(2);
			responseMap.put("exists", false);
			responseMap.put("modelNumber", null);
			
			try{
				List<Product> products= dashboardService.findModelNumber(brandName,productType);
				if(!products.isEmpty()){
					responseMap.put("exists", true);
					List<String> modelNumber=new ArrayList<String>();
					for (Product p : products) {
						modelNumber.add(p.getModelNumber());
					}
					responseMap.put("modelNumber", modelNumber);
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
				responseMap.remove("exists");
				responseMap.put("modelNumber", "Some error occured.");
				return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.BAD_REQUEST);
	}
			return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.OK);
}
	
	@RequestMapping(value="/getsize/{brandName}/{productType}/{modelNumber}",method=RequestMethod.GET)
	@ResponseBody public ResponseEntity<Map<String, Object>> getSize(@PathVariable(value="brandName") String brandName,@PathVariable(value="productType") String productType,@PathVariable(value="modelNumber") String modelNumber){
			
			Map<String, Object> responseMap = new HashMap<String, Object>(2);
			responseMap.put("exists", false);
			responseMap.put("size", null);
			
			try{
				List<Product> products= dashboardService.findSize(brandName,productType,modelNumber);
				if(!products.isEmpty()){
					responseMap.put("exists", true);
					List<String> size=new ArrayList<String>();
					for (Product p : products) {
						size.add(p.getSize());
					}
					responseMap.put("size", size);
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
				responseMap.remove("exists");
				responseMap.put("size", "Some error occured.");
				return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.BAD_REQUEST);
	}
			return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.OK);
}
	
	@RequestMapping(value="/getproduct-info/{brandName}/{productType}/{modelNumber}/{size}",method=RequestMethod.GET)
	@ResponseBody public ResponseEntity<Map<String, Object>> getproductinfo(@PathVariable(value="brandName") String brandName,@PathVariable(value="productType") String productType,@PathVariable(value="modelNumber") String modelNumber,
			@PathVariable(value="size") String size){
			
			Map<String, Object> responseMap = new HashMap<String, Object>(2);
			responseMap.put("exists", false);
			
			
			try{
				Product product= dashboardService.findproductInfo(brandName,productType,modelNumber,size);
				if(product!=null){
				responseMap.put("exists", true);
				responseMap.put("productId", product.getId());
				responseMap.put("discountRate",product.getDiscountRate());
				responseMap.put("unitPrice", product.getUnitPrice());
				responseMap.put("availableQuantity", product.getQuantity());
				}
			}
			catch(Exception e){
				e.printStackTrace();
				responseMap.remove("exists");
				responseMap.put("discountRate","Some Error Occured");
				responseMap.put("unitPrice", "Some Error Occured");
				responseMap.put("availableQuantity","Some Error Occured");
				return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.BAD_REQUEST);
	}
			return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.OK);
}
	/*@RequestMapping(value="/salesinvoice",method=RequestMethod.POST)
	public String saveSalesInvoiceDetails(Model model,@ModelAttribute SaleInvoice saleInvoice,@ModelAttribute Customer customer,
			HttpSession httpSession,@RequestParam(value="productId") long productId){
			try{
				
		
		customerService.addOrUpdateCustomer(customer);
		
		saleInvoice.setCustomer(customer);
		Product product=productServices.getProductById(productId);
		if(product!=null){
			if(product.getQuantity()<saleInvoice.getQuantity()){
				setError(model, "Sorry we have only "+product.getQuantity()+" units of inventory");
				return "redirect:/dashboard/salesinvoice";
			}
			product.setQuantity(product.getQuantity()-saleInvoice.getQuantity());
			productServices.addOrUpdateProduct(product);
			//saleInvoice.setProduct(product);
		}
		
		SessionUser sessionUser=SessionUser.getHttpSessionUser(httpSession);
		
		if(sessionUser.getRole().equalsIgnoreCase("Checker")){
			Checker checker=checkerServices.getCheckerById(sessionUser.getId());
			saleInvoice.setChecker(checker);
			
		}
		
		if(sessionUser.getRole().equalsIgnoreCase("Admin")){
			Admin admin=adminServices.getAdminById(sessionUser.getId());
			saleInvoice.setAdmin(admin);
		}
		
		if(sessionUser.getRole().equalsIgnoreCase("Sales Person")){
			SalesPerson salesPerson=salesPersonServices.getSalesPersonById(sessionUser.getId());
			saleInvoice.setSalesPerson(salesPerson);
		}
		saleInvoiceServices.addOrUpdateSaleInvoice(saleInvoice);
		TaxInvoice ti = new TaxInvoice();
		ti.setSaleInvoice(saleInvoice);
		taxInvoiceServices.addOrUpdateTaxInvoice(ti);
		
		CustomerReport cr = new CustomerReport();
		cr.setCustomer(customer);
		cr.setSaleInvoice(saleInvoice);
		customerReportServices.addOrUpdateCustomerReport(cr);
		model.addAttribute("Save_Success", true);
			
		System.out.println("success");
	}
			catch(Exception e){
				e.printStackTrace();
				setUnknownError(model);
			}
		return "redirect:/dashboard/salesinvoice";
	}*/
	
	@RequestMapping(value = "/checkUniqueEmail/{role}/{email}",  method = RequestMethod.GET)
	@ResponseBody public ResponseEntity<Map<String, Object>> checkUniqueExistance(
	    @PathVariable(value = "role") String role,
	    @PathVariable(value = "email") String email){
		
		Map<String, Object> responseMap = new HashMap<String, Object>(2);
		responseMap.put("exists", false);
		responseMap.put("message", email+" does not exists.");
		
		try{
			boolean emailExist=true;
			if(role.equalsIgnoreCase("Checker")){
				emailExist=checkerServices.checkUniqueEmail(email);
			}
			if(role.equalsIgnoreCase("Maker")){
				emailExist=makerServices.checkUniqueEmail(email);
			}
			if(role.equalsIgnoreCase("Sales Person")){
				emailExist=salesPersonServices.checkUniqueEmail(email);
			}
			
			if(emailExist){
				responseMap.put("exists", true);
				responseMap.put("message", email+" already exists.");
			}
		}
		catch(Exception e){
			e.printStackTrace();
			responseMap.remove("exists");
			responseMap.put("message", "Some error occured.");
			return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.BAD_REQUEST);
		}
		
		 return new ResponseEntity<Map<String,Object>>(responseMap, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public String showProductList(Model model){
		List<Product> products=productServices.getAllProducts();
		model.addAttribute("products", products);
		 return "product-list";
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
	public String addProduct(){
		 return "add-product";
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String saveProduct(Model model,@ModelAttribute Product product,HttpSession httpSession){
		
		if(product.getBrand().trim().length()==0 ||product.getProductType().trim().length()==0 ||product.getSize().trim().length()==0){
			setError(model, "Brand name or Product Type or Size cannot be empty");
			return "add-product";
		}
		SessionUser currentUser=SessionUser.getHttpSessionUser(httpSession);
		product.setCreated(new Date());
		product.setUpdated(new Date());
		product.setCreatedby(currentUser.getId());
		product.setUpdatedby(currentUser.getId());
		productServices.addOrUpdateProduct(product);
		StockReport sr=new StockReport();
		sr.setId(product.getId());
		sr.setUnits(product.getQuantity());
		stockReportServices.createOrUpdateStockReport(sr);
		model.addAttribute("Success", true);
		return "redirect:/dashboard/products";
	}
	
	@RequestMapping(value="/update-product/{productId}",method=RequestMethod.GET)
	public String updateProduct(Model model,@PathVariable(value="productId") long productId){
		Product product=productServices.getProductById(productId);
		
		model.addAttribute("product", product);
		 return "update-product";
	}
	
	@RequestMapping(value="/update-product/{productId}",method=RequestMethod.POST)
	public String SaveUpdatedProduct(Model model,HttpSession httpSession,@ModelAttribute Product product,@PathVariable(value="productId") long productId){
		
		Product productFromDb=productServices.getProductById(productId);
		
		if(productFromDb==null){
			setError(model, "Sorry no product found for updation");
			 return "update-product";
		}
		
		SessionUser currentUser=SessionUser.getHttpSessionUser(httpSession);
		
		productFromDb.setBrand(product.getBrand());
		productFromDb.setProductType(product.getProductType());
		productFromDb.setModelNumber(product.getModelNumber());
		productFromDb.setSize(product.getSize());
		productFromDb.setPurchaseUnitPrice(product.getPurchaseUnitPrice());
		productFromDb.setUnitPrice(product.getUnitPrice());
		productFromDb.setDiscountRate(product.getDiscountRate());
		productFromDb.setQuantity(product.getQuantity());
		productFromDb.setUpdated(new Date());
		productFromDb.setUpdatedby(currentUser.getId());
		productServices.addOrUpdateProduct(productFromDb);
		StockReport stockReport=stockReportServices.getStockReportByProductId(productFromDb.getId());
		if(stockReport!=null){
			stockReport.setUnits(productFromDb.getQuantity());
			stockReportServices.createOrUpdateStockReport(stockReport);
		}
		
		model.addAttribute("Update_Msg", true);
		 return "redirect:/dashboard/products";
	}
	
	@RequestMapping(value="/suppliers",method=RequestMethod.GET)
	public String showSupplierList(Model model){
		List<Supplier> suppliers=supplierServices.getAllSupplier();
		model.addAttribute("suppliers", suppliers);
		 return "supplier-list";
	}
	
	@RequestMapping(value="/addsupplier",method=RequestMethod.GET)
	public String addSupplier(){
		 return "add-supplier";
	}
	
	@RequestMapping(value="/addsupplier",method=RequestMethod.POST)
	public String saveProduct(Model model,@ModelAttribute Supplier supplier,HttpSession httpSession){
		
		if(supplier.getName().trim().length()==0 ||supplier.getEmail().trim().length()==0 ||supplier.getAddress().length()==0){
			setError(model, "name or Email or Address of supplier cannot be empty");
			return "add-product";
		}
		
		SessionUser currentUser=SessionUser.getHttpSessionUser(httpSession);
		if(currentUser.getRole().equalsIgnoreCase("Admin")){
			Admin admin=adminServices.getAdminById(currentUser.getId());
			supplier.setAdmin(admin);
		}
		
		if(currentUser.getRole().equalsIgnoreCase("Checker")){
			Checker checker=checkerServices.getCheckerById(currentUser.getId());
			supplier.setChecker(checker);
		}
		supplierServices.addOrUpdateSupplier(supplier);
		model.addAttribute("Success", true);
		return "redirect:/dashboard/suppliers";
	}
	
	@RequestMapping(value="/update-supplier/{supplierId}",method=RequestMethod.GET)
	public String updateSupplier(Model model,@PathVariable(value="supplierId") long supplierId){
		Supplier supplier=supplierServices.getSupplierById(supplierId);
		model.addAttribute("supplier", supplier);
		 return "update-supplier";
	}
	
	@RequestMapping(value="/update-supplier/{supplierId}",method=RequestMethod.POST)
	public String SaveUpdatedSupplier(Model model,HttpSession httpSession,@ModelAttribute Supplier supplier,@PathVariable(value="supplierId") long supplierId){
		
		Supplier supplierFromDb=supplierServices.getSupplierById(supplierId);
		
		if(supplierFromDb==null){
			setError(model, "Sorry no supplier found for updation");
			 return "update-supplier";
		}
		
		supplierFromDb.setAddress(supplier.getAddress());
		supplierFromDb.setName(supplier.getName());
		supplierFromDb.setContactNo(supplier.getContactNo());
		supplierFromDb.setEmail(supplier.getEmail());
		
		supplierServices.addOrUpdateSupplier(supplierFromDb);
		model.addAttribute("Update_Msg", true);
		 return "redirect:/dashboard/suppliers";
	}

	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public String showCustomerList(Model model){
		List<Customer> customers=customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		 return "customer-list";
	}
	
	@RequestMapping(value="/addcustomer",method=RequestMethod.GET)
	public String addCustomer(){
		 return "add-customer";
	}
	
	@RequestMapping(value="/addcustomer",method=RequestMethod.POST)
	public String saveCustomer(Model model,@ModelAttribute Customer customer,HttpSession httpSession){
		
		if(customer.getName().trim().length()==0 ||customer.getEmail().trim().length()==0 ||customer.getAddress().length()==0){
			setError(model, "name or Email or Address of customer cannot be empty");
			return "add-customer";
		}
		
		SessionUser currentUser=SessionUser.getHttpSessionUser(httpSession);
		if(currentUser.getRole().equalsIgnoreCase("Admin")){
			Admin admin=adminServices.getAdminById(currentUser.getId());
			customer.setAdmin(admin);
		}
		
		if(currentUser.getRole().equalsIgnoreCase("Checker")){
			Checker checker=checkerServices.getCheckerById(currentUser.getId());
			customer.setChecker(checker);
		}
		
		if(currentUser.getRole().equalsIgnoreCase("Maker")){
			Maker maker=makerServices.getMakerById(currentUser.getId());
			customer.setMaker(maker);
		}
		if(currentUser.getRole().equalsIgnoreCase("Sales Person")){
			SalesPerson salesPerson=salesPersonServices.getSalesPersonById(currentUser.getId());
			customer.setSalesPerson(salesPerson);
		}
		customerService.addOrUpdateCustomer(customer);
		model.addAttribute("Success", true);
		return "redirect:/dashboard/customers";
	}
	
	@RequestMapping(value="/update-customer/{customerId}",method=RequestMethod.GET)
	public String updateCustomer(Model model,@PathVariable(value="customerId") long customerId){
		Customer customer=customerService.getCustomerById(customerId);
		model.addAttribute("customer", customer);
		 return "update-customer";
	}
	
	@RequestMapping(value="/update-customer/{customerId}",method=RequestMethod.POST)
	public String SaveUpdatedCustomer(Model model,HttpSession httpSession,@ModelAttribute Customer customer,@PathVariable(value="customerId") long customerId){
		
		Customer customerFromDb=customerService.getCustomerById(customerId);
		
		if(customerFromDb==null){
			setError(model, "Sorry no customer found for updation");
			 return "update-customer";
		}
		
		customerFromDb.setAddress(customer.getAddress());
		customerFromDb.setName(customer.getName());
		customerFromDb.setContactNo(customer.getContactNo());
		customerFromDb.setEmail(customer.getEmail());
		
		customerService.addOrUpdateCustomer(customer);		
		model.addAttribute("Update_Msg", true);
		 return "redirect:/dashboard/customers";
	}
	
/*	@RequestMapping(value="/justcheck",method=RequestMethod.GET)
	public void checkSaveSaleinvoice(){
		
		Admin admin=adminServices.getAdminById(6);
		
		SaleInvoice saleinvoice=new SaleInvoice();
		saleinvoice.setCmpySaleInvoiceNo("Adf4563");
		saleinvoice.setAmountPaid(20550.5);
		saleinvoice.setBalanceLeft(100.5);
		saleinvoice.setAdmin(admin);
		
		ProductSaleInvoice sip=new ProductSaleInvoice();
		Product p1=productServices.getProductById(1);
		Product p2=productServices.getProductById(2);
		sip.setProduct(p1);
		sip.setSaleinvoice(saleinvoice);
		sip.setComment("ookk");
		
		dashboardService.saveSID(sip);
		System.out.println("success");
	
	}*/
	
		@RequestMapping(value="/save-saleinvoice", method=RequestMethod.POST)
		public ResponseEntity<String> saveSaleinvoice(@RequestBody SaleInvoiceProductDTO sipd, HttpServletRequest request,HttpServletResponse response,HttpSession httpSession) throws IOException{
			/* JsonParser parser=new JsonParser();
			 JsonObject jsonObj=(JsonObject) parser.parse(sipd);
			 System.out.println(jsonObj);*/
			try{
			List<ProductDTO> productss=sipd.getProducts();
			for (ProductDTO product : productss) {
				//StockReport stockReport=stockReportServices.getStockReportByProductId(product.getId());
				Product pro=productServices.getProductById(product.getId());
				
				if(pro.getQuantity()<product.getQuantity()){
					return new ResponseEntity<String>("Available Inventory product with brand>"+product.getBrand()+" and product Type"+product.getProductType()+" is "+pro.getQuantity(),HttpStatus.BAD_REQUEST);
				}
			
			}
			
			SaleInvoice saleinvoice=new SaleInvoice();
			
			saleinvoice.setCmpySaleInvoiceNo(sipd.getInvoiceNumber());
			saleinvoice.setTotalDiscountedAmount(sipd.getTotalDiscount());
			saleinvoice.setFinalAmount(sipd.getFinalAmount());
			if(sipd.getDate()==null)
			saleinvoice.setInvoiceDate(new Date());
			else
			saleinvoice.setInvoiceDate(sipd.getDate());
			saleinvoice.setAmountPaid(sipd.getAmountPaid());
			saleinvoice.setPaymentMode(sipd.getPaymentMode());
			saleinvoice.setBalanceLeft(sipd.getBalanceLeft());
			
			Customer customer=null;
			if(sipd.getCustomerEmail()!=null && sipd.getCustomerEmail().trim().length()!=0){
			customer=customerService.getCustomerByEmail(sipd.getCustomerEmail());
			if(customer!=null){
				saleinvoice.setCustomer(customer);
			}
			}
			
			if(customer==null){
				if(sipd.getCustomerContact()!=null && sipd.getCustomerContact().trim().length()!=0 &&sipd.getCustomerContact().trim().length()==10)
				customer=customerService.getCustomerByMobile(Long.parseLong(sipd.getCustomerContact()));
				if(customer!=null){
				saleinvoice.setCustomer(customer);
				}
				}
			
			if(customer==null){
				customer=new Customer();
				customer.setEmail(sipd.getCustomerEmail());
				customer.setName(sipd.getCustomerName());
				customer.setAddress(sipd.getCustomerAddress());
				customer.setContactNo(Long.parseLong(sipd.getCustomerContact()));
				
			}
			
			SessionUser sessionUser=SessionUser.getHttpSessionUser(httpSession);
			
			if(sessionUser.getRole().equalsIgnoreCase("Checker")){
				Checker checker=checkerServices.getCheckerById(sessionUser.getId());
				saleinvoice.setChecker(checker);
				customer.setChecker(checker);
				
			}
			
			if(sessionUser.getRole().equalsIgnoreCase("Admin")){
				Admin admin=adminServices.getAdminById(sessionUser.getId());
				saleinvoice.setAdmin(admin);
				customer.setAdmin(admin);
			}
			
			if(sessionUser.getRole().equalsIgnoreCase("Sales Person")){
				SalesPerson salesPerson=salesPersonServices.getSalesPersonById(sessionUser.getId());
				saleinvoice.setSalesPerson(salesPerson);
				customer.setSalesPerson(salesPerson);
			}
			
			if(sessionUser.getRole().equalsIgnoreCase("Maker")){
				Maker maker=makerServices.getMakerById(sessionUser.getId());
				customer.setMaker(maker);
				}
			
			customerService.addOrUpdateCustomer(customer);
			saleinvoice.setCustomer(customer);
			
		
			saleInvoiceServices.addOrUpdateSaleInvoice(saleinvoice);
			
			List<ProductDTO> products=sipd.getProducts();
			for (ProductDTO product : products) {
				
				ProductSaleInvoice psi=new ProductSaleInvoice();
				Product pro=productServices.getProductById(product.getId());
				pro.setQuantity((pro.getQuantity()-product.getQuantity()));
				productServices.addOrUpdateProduct(pro);
				
				StockReport stockReport=stockReportServices.getStockReportByProductId(pro.getId());
				stockReport.setUnits(pro.getQuantity());
				stockReportServices.createOrUpdateStockReport(stockReport);
				
				psi.setProduct(pro);
				psi.setSaleinvoice(saleinvoice);
				psi.setComment(sipd.getComments());
				psi.setQuantity(product.getQuantity());
				psi.setUnitPrice(product.getUnitPrice());
				psi.setDiscountRate(product.getDiscountRate());
				
				dashboardService.saveSID(psi);
			}
			
			
			TaxInvoice ti = new TaxInvoice();
			ti.setSaleInvoice(saleinvoice);
			taxInvoiceServices.addOrUpdateTaxInvoice(ti);
			
			CustomerReport cr = new CustomerReport();
			cr.setCustomer(customer);
			cr.setSaleInvoice(saleinvoice);
			customerReportServices.addOrUpdateCustomerReport(cr);
		
		
		return new ResponseEntity<String>(String.valueOf(saleinvoice.getSaleInvoiceNo()),HttpStatus.OK);
	}
			catch(Exception e){
				e.printStackTrace();
				return new ResponseEntity<String>("some error",HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		
	}
		@RequestMapping(value="/finalSaleInvoice",method=RequestMethod.GET)
		public String finalSaleInvoice(Model model,@RequestParam(value="si") String si){
			
			if(si!=null ||si.trim().length()!=0){
				SaleInvoice saleInvoice=saleInvoiceServices.getSaleInvoiceById(Long.parseLong(si));
				List<ProductSaleInvoice> productSaleInvoices=saleInvoice.getProductSaleInvoices();
				
				if(!productSaleInvoices.isEmpty()){
				model.addAttribute("listProductSaleInvoices", productSaleInvoices);
				for (ProductSaleInvoice productSaleInvoice : productSaleInvoices) {
					System.out.println(productSaleInvoice.getSaleinvoice().getCustomer().getName());
				}
				return "final-saleInvoice";
				}
			}
			model.addAttribute("error", "something went wrong! Try again");
			 return "sales-invoice";
		}
	
		@RequestMapping(value="/purchaseInvoice",method=RequestMethod.GET)
		public String rendorPurchaseInvoice(Model model) throws Exception{
			List<Supplier> suppliers=supplierServices.getAllSupplier();
			Map<String,String> map=new HashMap<String,String>();
			for (Supplier supplier : suppliers) {
				map.put(supplier.getName(), supplier.toJSON());
			}
			model.addAttribute("suppliers", map);
			return "purchaseInvoice";
		}
		
	@RequestMapping(value="/save-purchaseinvoice", method=RequestMethod.POST)
		public ResponseEntity<String> savePurchaseinvoice(@RequestBody PurchaseinvoiceProductDTO purchaseInvoiceProductDTO, HttpServletRequest request,HttpServletResponse response,HttpSession httpSession) throws IOException{
			
		try{
			Supplier supplier=supplierServices.getSupplierById(purchaseInvoiceProductDTO.getSupplierId());
			
			if(supplier==null){
				return new ResponseEntity<String>("Supplier does not exits",HttpStatus.BAD_REQUEST);
			}
				PurchaseInvoice purchaseInvoice=new PurchaseInvoice();
				purchaseInvoice.setCmpyPurchaseInvoiceNo(purchaseInvoiceProductDTO.getInvoiceNumber());
				purchaseInvoice.setAmountPaid(purchaseInvoiceProductDTO.getAmountPaid());
				purchaseInvoice.setBalanceLeft(purchaseInvoiceProductDTO.getBalanceLeft());
				purchaseInvoice.setComments(purchaseInvoiceProductDTO.getComments());
				purchaseInvoice.setDiscountAmount(purchaseInvoiceProductDTO.getTotalDiscount());
				purchaseInvoice.setFinalAmount(purchaseInvoiceProductDTO.getFinalAmount());
				purchaseInvoice.setSupplier(supplier);
				
				if(purchaseInvoiceProductDTO.getDate()==null)
					purchaseInvoice.setDate(new Date());
				else
					purchaseInvoice.setDate(purchaseInvoiceProductDTO.getDate());
				
				purchaseInvoiceServices.addOrUpdatePurchaseInvoice(purchaseInvoice);
				
				
				List<ProductDTO> products=purchaseInvoiceProductDTO.getProducts();
				for (ProductDTO product : products) {
					
					ProductPurchaseInvoice ppi=new ProductPurchaseInvoice();
					Product pro=productServices.getProductById(product.getId());
					if(pro==null){
						return new ResponseEntity<String>("Product detals not available",HttpStatus.BAD_REQUEST);
					}
					
					pro.setQuantity(product.getQuantity()+pro.getQuantity());
					productServices.addOrUpdateProduct(pro);
					
					StockReport stockReport=stockReportServices.getStockReportByProductId(pro.getId());
					stockReport.setUnits(pro.getQuantity());
					stockReportServices.createOrUpdateStockReport(stockReport);
					
					ppi.setDiscountRate(product.getDiscountRate());
					ppi.setQuantity(product.getQuantity());
					ppi.setPurchaseInvoice(purchaseInvoice);
					ppi.setProduct(pro);
					ppi.setUnitPrice(product.getUnitPrice());
					ppi.setUnitPriceBeforeDiscount(product.getUnitPriceBeforeDiscount());
					
					dashboardService.savePurchaseInvoiceDetails(ppi);
			}
		}
			catch(Exception e){
				
			}
		System.out.println("hehe");
			return new ResponseEntity<String>("okkk",HttpStatus.OK);
		}
}
