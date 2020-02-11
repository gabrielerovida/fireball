<%@include file="header.jsp" %>

<div class="container-fluid">
	<div class="row vh-100 fix-height bg-light">
		<div class="col-12 col-sm-auto bg-dark">
			<%@include file="sidebar.jsp" %>
		</div>
		<div class="col">
			<div class="p-4">
				<div class="h1 font-weight-bold border-bottom">Situazione</div>
				<div class="row">
					<div class="col">
						<div class="py-1">
							Il tuo ultimo accesso: <b><s:date name="#session.admin.last_activity_date" format="dd/MM/yyyy HH:mm" /></b>
						</div>	
					</div>
				</div>
				<div class="row">
					<div class="col-12 col-sm-6 col-md-6 col-lg-4 col-xl-3">
						<div class="py-4">
							<div class="p-3 border shadow-sm rounded">
								<div class="h3"><a href="leads" class="text-primary"><i class="fas fa-users"></i> Contatti</a></div>
								<p><b><s:property value="%{countLeads}" /></b> inserimenti</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="footer.jsp" %>