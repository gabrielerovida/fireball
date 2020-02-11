<%@include file="header.jsp" %>

<div class="container">
	<div class="row justify-content-center vh-100">
		<div class="col-12 col-sm-10 col-md-6 col-lg-6 col-xl-4 align-self-center">
			
			<div class="row">
				<div class="col">
					<img class="img-fluid" src="images/logo-tp.png">
				</div>
			</div>
			
			<s:form action="login" method="post" cssClass="form-horizontal mt-4" theme="simple">
				
				<div class="input-group mb-2">
        			<div class="input-group-prepend">
          				<div class="input-group-text"><i class="fas fa-user"></i></div>
        			</div>
        			<s:textfield name="admin.username" cssClass="form-control" placeholder="* Nome utente" required="true" />
				</div>
				
				<div class="input-group mb-2">
        			<div class="input-group-prepend">
          				<div class="input-group-text"><i class="fas fa-key"></i></div>
        			</div>
        			<s:password name="admin.password" cssClass="form-control" placeholder="* Password" required="true" />
				</div>

      			<s:submit value="Accedi" cssClass="btn btn-primary w-100" />
   		 	</s:form>	
		</div>
	</div>
</div>

<%@include file="footer.jsp" %>