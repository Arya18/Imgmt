<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
          <body class="skin-black">
        
            <aside class="right-side">                
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Create users
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
                                    <h3 class="box-title">Quick Example</h3>
                                     
                                   
                                </div><!-- /.box-header -->
                                <!-- form start -->
                                
                                <form role="form" action="/dashboard/createUsers" method="post">
                                 <c:if test="${hasError eq true}">
     
      							<div class="alert alert-danger text-center">
	    						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	   								 <strong>${message}</strong>
	 						 	</div>
     							</c:if>
     						 <c:if test="${Update_Msg==true}">
     
      							<div class="alert alert-success text-center">
	    						<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	   								 <strong>User has been created successfully</strong>
	 						 	</div>
     							</c:if>
                                    <div class="box-body">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Email address</label>
                                            <input type="email" placeholder="Enter email" name="email" id="email" class="form-control">
                                            <div class="error_email hidden" style="color: red;"></div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">Password</label>
                                            <input type="password" placeholder="Password" name="password" id="exampleInputPassword1" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1" >Select role</label>
                                           <select class="form-control" name="role" onchange="checkUniqueExistance(this.value);">
                                            	<option value="">--Select Role--</option>
                                            	<option value="Maker">Maker</option>
                                            	<option value="Checker">Checker</option>
                                            	<option value="Sales Person">Sales Person</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label for="username">Username</label>
                                            <input type="username" placeholder="Username" id="username" name="username" class="form-control">
                                        </div>
                                    </div>
                                         <div class="radio">
                                            <label class="">
                                                <div class="iradio_minimal" style="position: relative;" aria-checked="false" aria-disabled="false"><input type="radio" value="active" name="status" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255) none repeat scroll 0% 0%; border: 0px none; opacity: 0;"></ins></div> Active
                                            </label>
                                            <label class="">
                                                <div class="iradio_minimal" style="position: relative;" aria-checked="false" aria-disabled="false"><input type="radio" name="status" value="inactive" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255) none repeat scroll 0% 0%; border: 0px none; opacity: 0;"></ins></div> Inactive
                                            </label>
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
            
              <script>
      function checkUniqueExistance(role){
    	   var email=$('#email').val();
    	   if(email.trim().length>0){
    	   var url="/dashboard/checkUniqueEmail/"+role+"/"+email;
    	  
    	   $.ajax({
    	           url : url,
    	            dataType : "json",
    	            cache: false,
    	            async: false,
    	           success: function(data) {
    	           if(data.exists){
    	            $(".error_email").removeClass('hidden');
    	                 $(".error_email").html(data.message);
    	                $('#email').focus();

    	           }
    	           else{
    	            $(".error_email").addClass('hidden');
    	           }
    	           
    	           },
    	           error: function(e) {
    	          
    	           }
    	         });
       } 
      }
       </script>