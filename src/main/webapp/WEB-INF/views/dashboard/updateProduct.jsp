<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
          <body class="skin-black">
        
            <aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        update Products
                        <!-- <small>Control panel</small> -->
                    </h1><br/>
                    <!-- <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Blank page</li>
                    </ol> -->
                    <div class="row">
                    	<div class="col-md-12">
                            <!-- general form elements -->
                            <div class="box box-primary">
                                <div class="box-header">
                                    <h3 class="box-title">Add products</h3>
                                     
                                   
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                
                                <form role="form" action="/dashboard//update-product/${product.id}" method="post">
                                 <c:if test="${hasError eq true}">
     
      							<div class="alert alert-danger text-center">
	    						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	   								 <strong>${message}</strong>
	 						 	</div>
     							</c:if>
     						
                                    <div class="box-body">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="brand">Brand</label>
                                            <input type="text" placeholder="eg(LG,Voltas)" name="brand" id="brand" value="${product.brand}" class="form-control">
                                           
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="productType">Product Type</label>
                                            <input type="text" placeholder="eg(Split,window,double door)" name="productType" value="${product.productType}" id="productType" class="form-control">
                                        </div>
                                    </div>
                                   
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="modelNumber">Model Number</label>
                                            <input type="text" placeholder="Model Number" id="modelNumber" name="modelNumber" value="${product.modelNumber}" class="form-control">
                                        </div>
                                    </div>
                                    
                                       <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="size">Size</label>
                                            <input type="text" placeholder="eg(1 Ton,2 Ton)" name="size" id="size" value="${product.size}" class="form-control">
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="discountRate">Discount Rate</label>
                                            <input type="text" placeholder="Discount Rate" name="discountRate" id="discountRate" value="${product.discountRate}" class="form-control">
                                        </div>
                                    </div>
                                    
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="quantity">Avalible Quantity</label>
                                            <input type="number" placeholder="Available Quantity" id="quantity" min="0" name="quantity" value="${product.quantity}" class="form-control">
                                        </div>
                                    </div>
                                    
                                      <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="reorderPoint">Reorder Point</label>
                                            <input type="number" placeholder="Reorder point" id="reorderPoint" min="0" name="reorderPoint" value="${product.reorderPoint}" class="form-control">
                                        </div>
                                    </div>
                           
                                    </div><!-- /.box-body -->

                                    <div class="box-footer">
                                        <button class="btn btn-primary" type="submit">Submit</button>
                                    </div>
                                </form>
                            </div><!-- /.box -->

                            <!-- Form Element sizes -->
                            

                        </div>
                    </div>
                </section>

                <!-- Main content -->
                <section class="content">


                </section><!-- /.content -->
            </aside><!-- /.right-side -->
            </body>