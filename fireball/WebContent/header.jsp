<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html lang="it-IT">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<s:if test="#application.app.getProperty('published')==1">
	<base href="<s:property value="#application.app.getProperty('url_prod')"/>">
</s:if>
<s:else>
	<base href="<s:property value="#application.app.getProperty('url_local')"/>">
</s:else>
<title>Moonwalker Basic</title> 
<link rel="stylesheet" href="css/bootstrap.min.css"> 
<link rel="stylesheet" href="css/all.min.css"> 
<link rel="stylesheet" href="css/custom.css">
<sx:head />
</head>
<body>

<div class="load-window bg-light">
	<div class="container"> 
		<div class="row vh-100 justify-content-center">
			<div class="col-10 col-lg-4 col-xl-3 align-self-center">
				<div class="progress">
  					<div class="progress-bar progress-bar-striped progress-bar-animated bg-primary" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%"></div>
				</div>
			</div>
		</div>
	</div>
</div>

<s:if test="%{#session.logged_on==true}">

<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary shadow-sm">
  		<a class="navbar-brand" href="#">
  			<img src="images/logo-tp.png" height="30">
  		</a>
  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    		<span class="navbar-toggler-icon"></span>
  		</button>
  		<div class="collapse navbar-collapse" id="navbarSupportedContent">
    		<ul class="navbar-nav mr-auto">
      			<li class="nav-item dropdown">
        			<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          				File
        			</a>
        			<div class="dropdown-menu" aria-labelledby="navbarDropdown">
          				<a class="dropdown-item" href="#">Preferenze</a>
          				<div class="dropdown-divider"></div>
          				<a class="dropdown-item" href="logout">Esci</a>
        			</div>
      			</li>
    		</ul>
    		<ul class="navbar-nav ml-auto">
    			<li class="nav-item">
    				<a href="#" class="nav-link"><i class="fas fa-user"></i> <s:property value="%{#session.admin.first_name}"/> <s:property value="%{#session.admin.last_name}"/></a>
    			</li>
    		</ul>
  		</div>
	</nav>
</header>

</s:if>
