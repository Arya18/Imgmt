<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <!-- page script -->
        
 <style>
.downloadbutton{
margin-top:-40px;
}
</style>
 <body class="skin-black">
<aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                       Update Product location
                        <!-- <small>advanced tables</small> -->
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="#">Update product location</a></li>
                        <li class="active">Update product location</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="row">
                        <div class="col-xs-12">
                            <!-- /.box -->
                            
                            <div class="box">
                                <div class="box-header">
                                    <h3 class="box-title">Data Table With Full Features</h3>  
                                </div><!-- /.box-header -->
                                 
                                   <c:if test="${param.Update_Msg==true}">
     
      							<div class="alert alert-success text-center">
	    						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	   								 <strong>Product has been updated successfully</strong>
	 						 	</div>
     							</c:if> 
                                <div class="box-body table-responsive">
                                    <table id="example1" class="table table-bordered table-striped">
                                        <thead>
                                                 <tr>
                                                 <th>Purchase Invoice No.</th>
                                                <th>Unit price</th>
                                                <th>Discount Rate</th>
                                                <th>Serial No</th>
                                                <th>Sale</th>
                                                <th>Indoor Serial No</th>
                                                 <th>Indoor Sale</th>
                                                 <th>Location</th>
                                                 <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                         <c:forEach var="productPurchaseInvoice" items="${productPurchaseInvoices}">
       
									        <tr id="${productPurchaseInvoice.id}">
									        
									        <td>${productPurchaseInvoice.purchaseInvoice.cmpyPurchaseInvoiceNo}</td>
									        <td>${productPurchaseInvoice.unitPrice}</td>
									         <td>${productPurchaseInvoice.discountRate}</td>
									         <td>${productPurchaseInvoice.serialNo}</td>
									         <td>${productPurchaseInvoice.sale}</td>
									         <td>${productPurchaseInvoice.indoorSerialNo}</td>
									         <td>${productPurchaseInvoice.indoorsale}</td>
									         <td>${productPurchaseInvoice.location}</td>
									          <td>
				   <a href="/dashboard/update-unitLocation/${productPurchaseInvoice.id}" class="btn btn-sm btn-success"><span class="glyphicon glyphicon-pencil"></span> Edit</a>
				      </td>
                                           
                                        	 </tr>
                                           </c:forEach>
                                        </tbody>
                                      </table>
                                </div><!-- /.box-body -->
                            </div><!-- /.box -->
                        </div>
                    </div>

                </section><!-- /.content -->
            </aside><!-- /.right-side -->
            <script type="text/javascript">
        $(document).ready(function() {
        	
            	console.log("sad");
            	jQuery("#example1").dataTable();
                console.log("sad");
                $('#example2').dataTable({
                    "bPaginate": true,
                    "bLengthChange": false,
                    "bFilter": false,
                    "bSort": true,
                    "bInfo": true,
                    "bAutoWidth": false
                });
            });
        </script>
            </body>
            
       