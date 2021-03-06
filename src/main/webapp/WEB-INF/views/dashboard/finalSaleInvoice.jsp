<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <body class="skin-black">
	 <aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Invoice
                        <small>${saleInvoice.cmpySaleInvoiceNo}</small>
                    </h1>
                   <!--  <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="#">Examples</a></li>
                        <li class="active">Blank page</li>
                    </ol> -->
                </section>

              <!--   <div class="pad margin no-print">
                    <div class="alert alert-info" style="margin-bottom: 0!important;">
                        <i class="fa fa-info"></i>
                        <b>Note:</b> This page has been enhanced for printing. Click the print button at the bottom of the invoice to test.
                    </div>
                </div> -->

                <!-- Main content -->
                <section class="content invoice">                    
                    <!-- title row -->
                    <div class="row">
                        <div class="col-xs-12">
                            <h2 class="page-header">
                                <i class="fa fa-globe"></i> Deepak Cool Home
                                <small class="pull-right">Date: ${saleInvoice.invoiceDate}</small>
                            </h2>                            
                        </div><!-- /.col -->
                    </div>
                    <!-- info row -->
                    <div class="row invoice-info">
                        <div class="col-sm-4 invoice-col">
                            From
                            <address>
                                <strong>Deepak Cool Home</strong><br>
                                Gandi Park<br>
                                Agra Road,Aligarh<br>
                                Phone: 9999999999<br/>
                                Email: info@deepakCoolhome.com
                            </address>
                        </div><!-- /.col -->
                        <div class="col-sm-4 invoice-col">
                            To
                            <address>
                            <%-- <c:forEach var="ProductSaleInvoice" items="${listProductSaleInvoices}"> 
                            
                                <strong>${ProductSaleInvoice.saleinvoice.customer.name}</strong><br></c:forEach>  --%>
                            
                                <strong>${saleInvoice.customer.name}</strong><br>
                                ${saleInvoice.customer.address}<br>
                                Phone:${saleInvoice.customer.contactNo}<br/>
                                Email:${saleInvoice.customer.email}
                            </address>
                        </div><!-- /.col -->
                        <div class="col-sm-4 invoice-col">
                            <b>Invoice ${saleInvoice.cmpySaleInvoiceNo}</b><br/>
                            <br/>
                          <!--   <b>Previous Invoice No:</b> #dd84545<br/>
                            <b>Payment Due:</b> 2/22/2014<br/>
                            <b>Payment Amount:Rs1025</b>  -->
                        </div><!-- /.col -->
                    </div><!-- /.row -->

                    <!-- Table row -->
                    <div class="row">
                        <div class="col-xs-12 table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                    	<th>IN No.</th>
                                        <th>Qty</th>
                                        <th>Product Type</th>
                                        <th>Brand</th>
                                        <th>Description</th>
                                        <th>Unit Price(in Rs)</th>
                                        <th>Discount Rate</th>
                                        <th>Unit price After Discount(in Rs)</th>
                                        <th>Serial Number</th>
                                        
                                    </tr>                                    
                                </thead>
                                <tbody>
                                <c:forEach var="productDetail" items="${productList}">
                                    <tr>
                                        <td>${productDetail.purchaseInvoiceNo}</td>
                                        <td>${productDetail.quantity}</td>
                                        <td>${productDetail.productType}</td>
                                        <td>${productDetail.brand}</td>
                                        <td>model No ${productDetail.model } ,size  ${productDetail.size}</td>
                                        <td>${productDetail.unitPrice }</td>
                                        <td>${productDetail.discountRate}</td>
                                       <td>${productDetail.unitPrice-((productDetail.unitPrice*productDetail.discountRate)/100)}</td>
                                       <%-- <td>${productDetail.unitPrice }</td> --%>
                                        <td>${productDetail.serialNo}</td>
                                    </tr>
                                    </c:forEach>
                                  
                                </tbody>
                            </table>                            
                        </div><!-- /.col -->
                    </div><!-- /.row -->

                    <div class="row">
                      
                        <div class="col-xs-6">
                            <p class="lead">Final Calculation</p>
                            <div class="table-responsive">
                                <table class="table">
                                
                                   
                                      <tr>
                                        <th>Total Discounted Amount:</th>
                                        <td>${saleInvoice.totalDiscountedAmount}</td>
                                    </tr>
                                     <tr>
                                        <th style="width:50%">Final Amount:(in Rs)</th>
                                        <td>${saleInvoice.finalAmount }</td>
                                    </tr>
                                   <!--  <tr>
                                        <th>Tax (13%)</th>
                                        <td>1404</td>
                                    </tr> -->
                               <!--      <tr>
                                        <th>Previous Balance:</th>
                                        <td>1025</td>
                                    </tr> -->
                                  
                                     <tr>
                                        <th>Amount paid:</th>
                                        <td>${saleInvoice.amountPaid}</td>
                                    </tr>
                                    <tr>
                                        <th>Balance left:</th>
                                        <td>${saleInvoice.balanceLeft}</td>
                                    </tr>
                                     <tr>
                                        <th>Payment Mode:(Cash or Cheque)</th>
                                        <td>${saleInvoice.paymentMode}</td>
                                    </tr>
                                </table>
                            </div>
                             <input type="button" value="Print" onclick="window.print()" />
                        </div><!-- /.col -->
                    </div><!-- /.row -->

              <!--       this row will not appear when printing
                    <div class="row no-print">
                        <div class="col-xs-12">
                            <button class="btn btn-default" onclick="window.print();"><i class="fa fa-print"></i> Print</button>
                            <button class="btn btn-success pull-right"><i class="fa fa-credit-card"></i> Submit Payment</button>  
                            <button class="btn btn-primary pull-right" style="margin-right: 5px;"><i class="fa fa-download"></i> Generate PDF</button>
                        </div>
                    </div> -->
                </section><!-- /.content -->
            </aside><!-- /.right-side -->
          </body>