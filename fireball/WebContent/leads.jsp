<%@include file="header.jsp" %>

<div class="container-fluid">
	<div class="row vh-100 fix-height bg-light">
		<div class="col-12 col-sm-auto bg-dark">
			<%@include file="sidebar.jsp" %>
		</div>
		<div class="col">
			<div class="p-4">
				<div class="h1 font-weight-bold border-bottom">Contatti</div>
				
				<div class="pt-2 pb-3">
					<ul class="nav nav-pills">
  						<li class="nav-item mr-4">
  							<a class="nav-link btn btn-primary btn-sm" role="button" href="leads/new"><i class="fas fa-plus"></i> Nuovo</a>
  						</li>
<!--   						<li class="nav-item mr-3"> -->
<!--   							<form class="form-inline" method="get" action="customers"> -->
<!--   								<div class="form-row"> -->
<!--   									<div class="form-group"> -->
<%--   										<input type="search" name="s" id="s" class="form-control mr-1" placeholder="Cerca..." value="<s:property value="#attr.s"/>"> --%>
<!--   									</div> -->
<!--   									<button type="submit" class="btn btn-primary btn-sm mr-1"><i class="fas fa-search"></i></button> -->
<%--   									<s:if test="%{#attr.s!=null}"> --%>
<%--   										<s:if test="%{page!=null}"> --%>
<%--   											<a href="customers?page=<s:property value="%{page}" />" class="nav-link btn btn-danger btn-sm" role="button"><i class="fas fa-times"></i> Azzera ricerca</a> --%>
<%--   										</s:if> --%>
<%--   										<s:else> --%>
<!--   											<a href="customers" class="nav-link btn btn-danger btn-sm" role="button"><i class="fas fa-times"></i> Azzera ricerca</a> -->
<%--   										</s:else> --%>
<%--   									</s:if> --%>
<!--   								</div> -->
<!--   							</form> -->
<!--   						</li> -->
					</ul>
				</div>
				
				<div class="table-responsive">
					<table class="table table-sm table-hover">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Rag. Soc.</th>
								<th scope="col">Cognome e nome</th>
								<th scope="col">Telefono</th>
								<th scope="col">E-mail</th>
								<th scope="col">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
						<s:iterator value="%{leads}" begin="%{begin}" end="%{end}">
							<tr>
								<th scope="row"><s:property value="%{id}" /></th>
								<td><s:property value="%{business_name}" /></td>
								<td><s:property value="%{last_name}" /> <s:property value="%{first_name}" /></td>
								<td><a href="tel:<s:property value="%{phone}" />"><s:property value="%{phone}" /></a></td>
								<td><a href="mailto:<s:property value="%{email}" />"><s:property value="%{email}" /></a></td>
								<td>
									<a href="leads/manage/<s:property value="%{id}" />" role="button" class="btn btn-primary btn-sm"><i class="fas fa-pencil-alt"></i></a>
								</td>
							</tr>
						</s:iterator>
						</tbody>
					</table>
				</div>
				
				<div class="row">
					<div class="col-12">
						<div class="py-4">
							<nav aria-label="Pagination">
  								<ul class="pagination justify-content-center">
    								<s:iterator value="%{paginator}" var="tpage">
    									<s:if test="%{#tpage==page}">
    										<s:if test="%{#attr.s!=null}">
    											<li class="page-item active"><a class="page-link" href="leads?s=<s:property value="#attr.s"/>&page=<s:property value="#tpage"/>"><s:property value="#tpage"/></a></li>
    										</s:if>
    										<s:else>
    											<li class="page-item active"><a class="page-link" href="leads?page=<s:property value="#tpage"/>"><s:property value="#tpage"/></a></li>
    										</s:else>
    									</s:if>
    									<s:else>
    										<s:if test="%{#attr.s!=null}">
    											<li class="page-item"><a class="page-link" href="leads?s=<s:property value="#attr.s"/>&page=<s:property value="#tpage"/>"><s:property value="#tpage"/></a></li>
    										</s:if>
    										<s:else>
    											<li class="page-item"><a class="page-link" href="leads?page=<s:property value="#tpage"/>"><s:property value="#tpage"/></a></li>
    										</s:else>
    									</s:else>
    								</s:iterator>
  								</ul>
							</nav>
						</div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>

<%@include file="footer.jsp" %>