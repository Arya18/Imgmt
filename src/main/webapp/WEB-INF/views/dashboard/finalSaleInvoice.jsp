<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <body class="skin-black">
	 <aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Invoice
                        <small>#007612</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="#">Examples</a></li>
                        <li class="active">Blank page</li>
                    </ol>
                </section>

                <div class="pad margin no-print">
                    <div class="alert alert-info" style="margin-bottom: 0!important;">
                        <i class="fa fa-info"></i>
                        <b>Note:</b> This page has been enhanced for printing. Click the print button at the bottom of the invoice to test.
                    </div>
                </div>

                <!-- Main content -->
                <section class="content invoice">                    
                    <!-- title row -->
                    <div class="row">
                        <div class="col-xs-12">
                            <h2 class="page-header">
                                <i class="fa fa-globe"></i> Deepak Cool Home
                                <small class="pull-right">Date: 11/10/2016</small>
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
                            
                                <strong>Gaurav Saxena</strong><br>
                                14/63,Achal Tal<br>
                                Dwarika Puri,Aligarh<br>
                                Phone:7859971140<br/>
                                Email:gaurav@gmail.com
                            </address>
                        </div><!-- /.col -->
                        <div class="col-sm-4 invoice-col">
                            <b>Invoice #007612</b><br/>
                            <br/>
                            <b>Previous Invoice No:</b> #dd84545<br/>
                            <b>Payment Due:</b> 2/22/2014<br/>
                            <b>Payment Amount:Rs1025</b> 
                        </div><!-- /.col -->
                    </div><!-- /.row -->

                    <!-- Table row -->
                    <div class="row">
                        <div class="col-xs-12 table-responsive">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Qty</th>
                                        <th>Product Type</th>
                                        <th>Brand</th>
                                        <th>Description</th>
                                        <th>Unit Price(in Rs)</th>
                                        <th>Discount Rate</th>
                                        <th>Unit price After Discount(in Rs)</th>
                                    </tr>                                    
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>2</td>
                                        <td>Split Ac</td>
                                        <td>LG</td>
                                        <td>model No>ss-456 ,size> 1Ton</td>
                                        <td>5000</td>
                                        <td>10%</td>
                                        <td>4500</td>
                                    </tr>
                                    <tr>
                                         <td>2</td>
                                        <td>Window Ac</td>
                                        <td>Voltas</td>
                                        <td>model No>mm-406 ,size> 1.5Ton</td>
                                        <td>7000</td>
                                        <td>10%</td>
                                        <td>6300</td>
                                    </tr>
                                 
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
                                        <th style="width:50%">Subtotal:(in Rs)</th>
                                        <td>10800</td>
                                    </tr>
                                    <tr>
                                        <th>Tax (13%)</th>
                                        <td>1404</td>
                                    </tr>
                                    <tr>
                                        <th>Previous Balance:</th>
                                        <td>1025</td>
                                    </tr>
                                    <tr>
                                        <th>Total:</th>
                                        <td>13229</td>
                                    </tr>
                                     <tr>
                                        <th>Amount paid:</th>
                                        <td>10000</td>
                                    </tr>
                                    <tr>
                                        <th>Balance left:</th>
                                        <td>3229</td>
                                    </tr>
                                     <tr>
                                        <th>Payment Mode:(Cash or Cheque)</th>
                                        <td>Cash</td>
                                    </tr>
                                </table>
                            </div>
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