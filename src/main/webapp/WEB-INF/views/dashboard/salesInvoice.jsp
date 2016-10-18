<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript">
      
            $(document).ready(function () {
                
           /* jQuery(".pickupDateTimeFormat").datetimepicker({
            format : "dd-mm-yyyy--HH:ii:P",
            showMeridian: true,
            autoclose: true
        });*/
                   /*  $('#example1').datepicker({
                        format: 'mm/dd/yyyy',
                        startDate: '01/01/2010',
                        endDate: '12/30/2020'
                    });  */ 
              
                $('#btnAdd').click(function () {
                    var num = $('.clonedInput').length;

                    var newNum = new Number(num);
                    alert(newNum);

                    var newElem = $('.clonedInput:last').clone().appendTo("#myForm").attr('id', 'input' + newNum).find("input[type='text']").val("");
                    //                 console.log($('.clonedInput:last').attr('id'));
//                     console.log(attrId);
                    $('.clonedInput:last').find("input, select").each(function(i){
                        var Id = $(this).attr('id');
                        var newId = Id.replace(/[0-9]/g, '');
                        var Name = $(this).attr('name');
                        var newName = Name.replace(/[0-9]/g, '');
                        $(this).attr({id: newId+newNum,name: newName+newNum})
                      
                    });
                  
                    var attrname = $('.clonedInput:last').find("input").attr("name");
                    $('#btnDel').removeAttr('disabled');
                    if (newNum == 5)
                        $('#btnAdd').attr('disabled', 'disabled');
                });

                $('#btnDel').click(function () {
                    var num = $('.clonedInput').length-1;
                        console.log(num)
                    $('#input' + num).remove();
                    $('#btnAdd').removeAttr('disabled');
                    if (num == 1)
                        $('#btnDel').attr('disabled', 'disabled');
                });

                    $('#btnDel').attr('disabled','disabled');
              
            });
        </script>
<body class="skin-black">
<aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Generate sale invoice
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
                                    <h3 class="box-title">Add products</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
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
                                            <label for="discount">Discount</label>
                                            <input type="number" name="discountRate" id="discountRate" readonly="true" ondblclick="this.readOnly='';" id="discount" class="form-control" required>
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
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="unitPrice">Unit Price</label>
                                            <input type="text" id="unitPrice" name="unitPrice" readonly="true" placeholder="Unit Price" value="400" id="unitPrice" class="form-control" required>
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
                                
                                
                            </div><!-- /.box -->
<!-- another -->
                            <div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Generate Invoice</h3>
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                <form role="form" id="customerForm">
                                <div class="box-body">
                                <div class="row">
                                <div class="error_msg"></div>
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="invoiceNumber">Invoice number</label>
                                            <input type="text" readonly="true" ondblclick="this.readOnly='';" placeholder="invoice number" id="invoiceNo" class="form-control" name="invoiceNumber" value="#abc1" required>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="finalAmount">Total Discount</label>
                                            <input type="text" placeholder="Discounted amount" id="discountAmount" name="totalDiscount" value="4%"readonly="true" class="form-control" required>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="finalAmount">Final amount</label>
                                            <input type="text" readonly="true" name="finalAmount" placeholder="Final amount" id="finalAmount" value="300" class="form-control" required>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                       <div class="form-group">
                                        <label>Date masks:</label>
                                        <div class="input-group">
                                            <div class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </div>
                                            <input type="text" data-inputmask="'alias': 'dd/mm/yyyy'" data-mask/ class="form-control invoicedate" name="dateMask" required>
                                        </div><!-- /.input group -->
                                    </div>
                                     </div>
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="CustomerName">Customer Name</label>
                                            <input type="text" placeholder="Customer name" id="CustomerName"  name="customerName" class="form-control" required>
                                        </div>
                                    </div>
                                    </div>
                                    <div class="row">
                                    <div class="col-md-2">
                                        <div class="form-group">
                                            <label for="CustomerContact">Customer Contact</label>
                                            <input type="text" placeholder="999999999" id="CustomerContact"  name="customerContact" class="form-control" required>
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label for="CustomerAddress">Customer Address</label>
                                            <textarea class="form-control" name="CustomerAddress" placeholder="Address here.."></textarea>
                                        </div>
                                    </div>     
                                    </div>                               
                                    <!-- div class="checkbox">
                                            <label class="">
                                                <div class="icheckbox_minimal" style="position: relative;" aria-checked="false" aria-disabled="false"><input type="checkbox" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255) none repeat scroll 0% 0%; border: 0px none; opacity: 0;"></ins></div> Active
                                            </label>
                                            <label class="">
                                                <div class="icheckbox_minimal" style="position: relative;" aria-checked="false" aria-disabled="false"><input type="checkbox" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255) none repeat scroll 0% 0%; border: 0px none; opacity: 0;"></ins></div> Inactive
                                            </label>
                                        </div> -->
                                    </div><!-- /.box-body -->

                                    <div class="box-footer">
                                        <button class="btn btn-primary" id="customerButton" type="button">Submit</button>
                                    </div>
                                </form>
                            </div><!-- /.box-body -->
                                
                            </div>

                            <!-- Form Element sizes -->
                            

                        </div>
                    </div>
                

                <!-- Main content -->
                


                </section><!-- /.content -->
            </aside><!-- /.right-side -->
                     
 <script type="text/javascript">
                            
		 $(function() {
		     //Datemask dd/mm/yyyy
		     $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
		     //Datemask2 mm/dd/yyyy
		     $("#datemask2").inputmask("mm/dd/yyyy", {"placeholder": "mm/dd/yyyy"});
		     //Money Euro
		     $("[data-mask]").inputmask();
		
		     //Date range picker
		     $('#reservation').daterangepicker();
		     //Date range picker with time picker
		     $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'MM/DD/YYYY h:mm A'});
		     //Date range as a button
		     $('#daterange-btn').daterangepicker(
		             {
		                 ranges: {
		                     'Today': [moment(), moment()],
		                     'Yesterday': [moment().subtract('days', 1), moment().subtract('days', 1)],
		                     'Last 7 Days': [moment().subtract('days', 6), moment()],
		                     'Last 30 Days': [moment().subtract('days', 29), moment()],
		                     'This Month': [moment().startOf('month'), moment().endOf('month')],
		                     'Last Month': [moment().subtract('month', 1).startOf('month'), moment().subtract('month', 1).endOf('month')]
		                 },
		                 startDate: moment().subtract('days', 29),
		                 endDate: moment()
		             },
				     function(start, end) {
				         $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
				     }
				     );
				
				     //iCheck for checkbox and radio inputs
				     $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
				         checkboxClass: 'icheckbox_minimal',
				         radioClass: 'iradio_minimal'
				     });
				     //Red color scheme for iCheck
				     $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
				         checkboxClass: 'icheckbox_minimal-red',
				         radioClass: 'iradio_minimal-red'
				     });
				     //Flat red color scheme for iCheck
				     $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
				         checkboxClass: 'icheckbox_flat-red',
				         radioClass: 'iradio_flat-red'
				     });
				
				     //Colorpicker
				     $(".my-colorpicker1").colorpicker();
				     //color picker with addon
				     $(".my-colorpicker2").colorpicker();
				
				     //Timepicker
				     $(".timepicker").timepicker({
				         showInputs: false
				     });
				 });
		 
		 function getProductTypes(brandName){
			 
             url=null;
             if(brandName!=null){
                  url="/dashboard/getproductType/"+brandName;
             }
             
             $.ajax({
                 url : url,
                  dataType : "json",
                  cache: false,
                  async: false,
                 success: function(response, status, code){
                	  jQuery("#productTypeContainer").html("<select class='form-control' name='productType' id='productTypeContainer' onchange='getModelNumber(this.value);'><option value="">--Select--</option></select>"); 
                   if(response.exists){
                       jQuery(".error_container").html("");
                       for( var index = 0; index < response.brandName.length; index ++){
                           ProductContainer ="<option value='"+ response.brandName[index] +"'>"+response.brandName[index]+"</option>";
                          
                           jQuery("#productTypeContainer").append(ProductContainer);
                      
                       }
                       
                       //ProductContainer ="</select></div></div>";
                       
                       jQuery("#productTypeContainer").append("</select></div></div>"); 
                       
                       }
                   else{
                       jQuery(".error_container").html("No Product Type for corresponding selected brand.");
                   }

                                   
                 }, 
                 error: function(response, status, code){
                
                jQuery(".error_container").html("Some error unknown error occurred.");
                 }
               });

          
      }
      
      function getModelNumber(productType){
          
          var brandName=$('#brand').val();
           url=null;
           if(brandName!=""){
                url="/dashboard/getModelNumber/"+brandName+"/"+productType;
           }
          $.ajax({
             url : url,
              dataType : "json",
              cache: false,
              async: false,
             success: function(response, status, code){
        
               if(response.exists){
                   jQuery(".error_container").html("");
                   for( var index = 0; index < response.modelNumber.length; index ++){
                           ModelContainer ="<option value='"+ response.modelNumber[index] +"'>"+response.modelNumber[index]+"</option>";
                           jQuery("#modelContainer").append(ModelContainer);
                      
                   }
                       
                      ModelContainer ="</select></div></div>";
                       
                       jQuery("#modelContainer").append(ModelContainer); 
                   
                   }
               else{
                   jQuery(".error_container").html("No Product Type for corresponding selected brand.");
               }

                               
             }, 
             error: function(response, status, code){
            
            jQuery(".error_container").html("Some error unknown error occurred.");
             }
           });
      }
      
      function getSize(modelNumber){
          
          var brandName=$('#brand').val();
          var productType=$('#productTypeContainer').val();
          
                url="/dashboard/getsize/"+brandName+"/"+productType+"/"+modelNumber;
       
          $.ajax({
             url : url,
              dataType : "json",
              cache: false,
              async: false,
             success: function(response, status, code){
        
               if(response.exists){
                   jQuery(".error_container").html("");
                   for( var index = 0; index < response.size.length; index ++){
                           SizeContainer ="<option value='"+ response.size[index] +"'>"+response.size[index]+"</option>";
                           jQuery("#sizeContainer").append(SizeContainer);
                      
                   }
                       
                  SizeContainer ="</select></div></div>";
                       
                       jQuery("#sizeContainer").append(SizeContainer); 
                   
                   }
               else{
                   jQuery(".error_container").html("No size for corresponding selected model.");
               }

                               
             }, 
             error: function(response, status, code){

            jQuery(".error_container").html("Some error unknown error occurred.");
             }
           });
      }
      
      function getProductInfo(size){
          
          var brandName=$('#brand').val();
          var productType=$('#productTypeContainer').val();
          var modelNumber=$('#modelContainer').val();
                url="/dashboard/getproduct-info/"+brandName+"/"+productType+"/"+modelNumber+"/"+size;
          
          $.ajax({
             url : url,
              dataType : "json",
              cache: false,
              async: false,
             success: function(response, status, code){
        
               if(response.exists){
                   jQuery(".error_container").html("");
                   
                   $('#unitPrice').val(response.unitPrice);
                   /* globalUnitPrice=response.unitPrice;
                  globalAvailableQuantity=response.availableQuantity; */
                  $('#discountRate').val(response.discountRate);
                  $('#productId').val(response.productId);
                   
                  }
               else{
                   jQuery(".error_container").html("No data available  for corresponding selected size.");
               }

          }, 
             error: function(response, status, code){
            
            jQuery(".error_container").html("Some error unknown error occurred.");
             }
           });
          
      }
		 
					var finalArray = {};
					var productArray =[];
					var customerArray =[];
					var count = 0;
					 $("#addProduct").on("click",function(){   
					     var result = {};
					     var serializeArray = $('#addProducts').serializeArray();
					     var bad = 0;
					     for (var i = 0; i < serializeArray.length; i++) {
					         if (!serializeArray[i].value) {
					             bad++;
					         }
					     }
					     if(bad>0){
					         alert("not filled");
					             return false;
					         }else{
					                 $.each(serializeArray, function() {
					                 result[this.name] = this.value;
					         });
					                 productArray[count] =  result;
					                 count++;
					                 console.log(JSON.stringify(productArray));
					                 // console.log(finalArray);
					                 if(productArray.length != null){
					                     alert("Product added !");
					                     $("#addProducts input").each(function() {
					                         this.value = "";
					                     });					                     
					                   }
					                 return false; // will be removed when make ajax call
					         }
					  
					});

				$("#customerButton").on("click",function(){   
					console.log($(".invoicedate").val());
				   /*   var resultCustomer = {};
				     var serializeArray = $('#customerForm').serializeArray();
				     var bad = 0;
				     $.each(serializeArray, function() {
				         resultCustomer[this.name] = this.value;
				     });
				                 customerArray = resultCustomer;
				                 console.log(JSON.stringify(customerArray));
				                 if(productArray.length != null){
				                     alert("customer added !");
				                 }
				                 finalArray["Products"] = productArray;
				                 finalArray["Customer"] = customerArray; */
				                 demoarr={};
				                 demoarr["invoiceNumber"]="ee-345";
				                 demoarr["totalDiscount"]="9940.9";
				                 demoarr["finalAmount"]="12582.6";
				                 demoarr["customerName"]="rahul singh";
				                 demoarr["customerContact"]="8058956893";
				                 demoarr["customerEmail"]="gaurav5@gmail.com";
				                 demoarr["customerAddress"]="sasni gate";
				                 demoarr["paymentMode"]="Cash";
				                 demoarr["amountPaid"]="89000";
				                 demoarr["balanceLeft"]="2000";
				                 demoarr["comments"]="okkk";
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
				                 
				                 
				                 var textJson = JSON.stringify(demoarr);
				                 console.log(textJson);
				                 alert(textJson);
				               /*  var x= jQuery.parseJSON(demoarr);
				                alert(x);
				                 console.log(x); */
				                 //calculateFinalAmount(x);
				                // return false;
				                alert("okkk");
				                
				                 jQuery.ajax({
				                     type : "POST",
				                     contentType: "application/json",
				                     url : "/dashboard/save-saleinvoice",
				                     data : JSON.stringify(demoarr),

				                     success : function(response, status, code){
				                    	 alert(response);
				                        window.location.href="/dashboard/finalSaleInvoice?si="+response;
				                     },
				                     error : function(response, status, code){
				                    	 alert("error "+response.responseText);
				                    	 $(".error_msg").html("<div class='alert alert-danger text-center'><a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>"+response.responseText+"</strong></div>");
 				                         
				                     }
				                 });
				  
				});

		function calculateFinalAmount(textJson){
		 var json = JSON.parse(textJson);
		for (var i = 0; i<json.Products.length; i++) {
		 console.log(json.Products[i].discountedAmount);
		 var totalDiscountValue = json.Products[i].discountedAmount;
		}
		
 
}
            </script>
            </body>