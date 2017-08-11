<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layouts/taglibs.jsp"%>

<div class="container">
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>#</th>
				<th>User name</th>
				<th>User email</th>
				<th>User password</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${users}" var="user" varStatus="status">
				<tr>
					<td>${status.index+1}</td>
					<td><a href="<spring:url value="users/${user.id}" />">${user.name}</a></td>
					<td><a href="<spring:url value="users/${user.id}" />">${user.email}</a></td>
					<td><a href="<spring:url value="users/${user.id}" />">${user.password}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>



	<c:forEach items="${users}" var="user"> 
${user.name}

   </c:forEach>
</div>
