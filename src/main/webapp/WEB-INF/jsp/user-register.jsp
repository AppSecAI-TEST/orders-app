<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="container">
	<form:form commandName="userDTO" cssClass="form-horizontal">
		<div class="form-group">
			<label for="name">Name</label>
			<form:input path="name" cssClass="form-control" />
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<form:input path="email" cssClass="form-control" />
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<form:password path="password" cssClass="form-control" />
			<!-- path corresponds to attributes name of object transfering data from the form -->
		</div>
		<button type="submit" class="btn btn-large btn-primary">Submit</button>
	</form:form>
</div>