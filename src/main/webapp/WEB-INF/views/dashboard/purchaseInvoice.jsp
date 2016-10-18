<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body class="skin-black">
<aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Generate Purchase Invoice
                        <!-- <small>Control panel</small> -->
                    </h1>
                   </section>
                    <!-- <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Blank page</li>
                    </ol> -->
                    <section class="content">
                    <div class="row">
                    	<div class="col-md-12">
                            <!-- general form elements -->
                            <div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Create purchase Invoice</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                
                                  <div class="row">
                    				<div class="col-md-12">
                                 <div class="col-md-3">
                                        <div class="form-group">
                                            <label for="supplier">Supplier</label>
                                             <select class="form-control" name="supplier" id="supplier" onchange="showSupplierDetails()">
                                                <option value="">--Select--</option>
                                              
                                                <c:forEach items="${suppliers}" var="supplier">
                                               <option value='${supplier.value}'>${supplier.key}</option>
                                                
                                                </c:forEach>
                                                
                                            </select>
                                        </div>
                                  </div>
                                <div class="supplierDetailsContainer"></div>
                                 </div>
                                  </div>
                                    
                                   <form role="form" id="addProducts">
                                <div class="box-body">
                                    <div class="row">
                                       <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Brand</label>
                                           <select class="form-control" name="brand" id="brand" onchange="getProductTypes(this.value);" required>
                                               <option value="">--Select--</option>
                                                <option>Voltas</option>
                                                <option>Whirpool</option>
                                                <option>LG</option>
                                                <option>samsung</option>
                                            </select>
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Product type</label>
                                             <select class="form-control" name="productType" id="productTypeContainer" onchange="getModelNumber(this.value);">
                                                <option value="">--Select--</option>
                                            </select>
                                        </div>
                                    </div>
                                 
                                    
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Model number</label>
                                          <select class="form-control" name="modelNumber" id="modelContainer" onchange="getSize(this.value);">
                                                <option value="">--Select--</option>
                                                
                                          </select>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Size</label>
                                          <select class="form-control" name="size" id="sizeContainer" onchange="getProductInfo(this.value)">
                                                <option value="">--Select--</option>
                                              
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="Quantity">Quantity</label>
                                            <input type="number" name="quantity" min="0" placeholder="Quantity" id="quantity" class="form-control" required>
                                        </div>
                                    </div>
                                    
                                      <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="unitPrice">Unit Price</label>
                                            <input type="text" id="unitPrice" name="unitPrice"  id="unitPrice" class="form-control" required>
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="discount">Discount</label>
                                            <input type="number" name="discountRate" id="discountRate" id="discount" class="form-control" required>
                                        </div>
                                    </div>
                                    </div>
                                    <div class="row">
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="finalAmount">Discounted amount</label>
                                            <input type="text" id="discountAmountt" name="discountedAmount" placeholder="Discounted amount" value="4" class="form-control" required>
                                        </div>
                                    </div>
                                  
                                    </div>
                                         <input type="hidden" id="productId" name="productId"/>                       
                                    
                                    </div><!-- /.box-body -->
								<div class="row" style="margin-left:0px !important;margin-right:0px !important;">
                                    <div class="box-footer">
                                        <button class="btn btn-primary" id="addProduct"  type="button">Add more</button>
                                    </div>
                                 </div>
                                </form>
                                 <div class="box-footer">
                                        <button class="btn btn-primary" id="customerButton" type="button">Submit</button>
                                    </div>
                                
                            </div><!-- /.box -->
                        
                                
                            </div>

                            <!-- Form Element sizes -->
                            

                        </div>
                    </div>
                

                <!-- Main content -->
                


                </section><!-- /.content -->
            </aside><!-- /.right-side -->
     </body>
     
    <script type="text/javascript">
     
    function showSupplierDetails(){
    	 var supplierDetailsJson=$('#supplier').val();
    	 var supplierDetails=JSON.parse(supplierDetailsJson);
    	 var id=supplierDetails.id;
    	 $(".supplierDetailsContainer").html("<label>Address>>"+supplierDetails.address+" Contact Number>>"+supplierDetails.contact+" Email>>"+supplierDetails.email+"</label>");
    	 
     }
     
     $("#customerButton").on("click",function(){ 
    	 
    	 var supplierDetailsJson=$('#supplier').val();
    	 var supplierDetails=JSON.parse(supplierDetailsJson);
    	 
         demoarr={};
         demoarr["invoiceNumber"]="ee-345";
        // demoarr["totalDiscount"]="9940.9";
         //demoarr["finalAmount"]="12582.6";
         demoarr["paymentMode"]="Cash";
         demoarr["amountPaid"]="89000";
         demoarr["balanceLeft"]="2000";
         demoarr["comments"]="okkk";
         demoarr["supplierId"]=supplierDetails.id;
        //demoarr["date"]=$(".invoicedate").val();
         products=[];
         product={};
         product["id"]="2";
         product["brand"]="LG";
         product["modelNumber"]="ss-110";
         product["productType"]="Split AC";
         product["quantity"]="10";
         product["unitPrice"]="5000";
         product["discountRate"]="5.2";
         
         product["size"]="1 Ton";
         
         products.push(product);
        
         demoarr["products"]=products;
         jQuery.ajax({
             type : "POST",
             contentType: "application/json",
             url : "/dashboard/save-purchaseinvoice",
             data : JSON.stringify(demoarr),

             success : function(response, status, code){
            	 alert("success");
            	 alert(response);
               // window.location.href="/dashboard/finalSaleInvoice?si="+response;
             },
             error : function(response, status, code){
            	 alert("error "+response.responseText);
            	 $(".error_msg").html("<div class='alert alert-danger text-center'><a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>"+response.responseText+"</strong></div>");
                  
             }
         });
     });
     
     </script>