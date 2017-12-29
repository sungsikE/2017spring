<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<body>
	<div class="container">
		<div class="row">
		  <div class="col-md-12">
			  <div class="jumbotron">	
			  	<h1>입력페이지</h1>
			  	<p>입력하세요오오오오오</p>
			  </div>
		  </div>
		</div>
		<div class="row">
		  <div class="col-md-12">
		  <form class="form-horizontal" method="post" action="./insert">
			  <div class="form-group">
			    <label for="sabun" class="col-sm-2 control-label">sabun</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="sabun" name="sabun" placeholder="sabun">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="name" name="name" placeholder="name">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="pay" class="col-sm-2 control-label">pay</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="pay" name="pay" placeholder="pay">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			     	<button type="submit" class="btn btn-primary">전송</button>
			     	<button type="reset" class="btn btn-default">취소</button>
			    </div>
			  </div>
			 
		
			</form>
		  </div>
	
		</div>
		</div>
</body>
</html>