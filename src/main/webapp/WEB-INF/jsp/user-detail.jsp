<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layouts/taglibs.jsp"%>


<div class="container">
	<c:forEach items="${users.userOrders}" var="order">
		<h1>${order.name}</h1>
		<p>${order.url}</p>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Title</th>
					<th>Link</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${order.items}" var="item" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td><a href="<spring:url value="items/${item.id}" />">${item.title}</a></td>
						<td><a href="<spring:url value="items/${item.id}" />">${item.link}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:forEach>
</div>
