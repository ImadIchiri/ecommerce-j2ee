<%@page import="com.ecommerce.Entity.Produit"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
		List<Produit> productsList =(List<Produit>) request.getAttribute("ProductsList");
    out.print(productsList);
	%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%for(Produit produit : productsList) { %>
		<div>
			<h4><%=produit.getNom() %></h4>
			<img src="images/products/image-<%=produit.getId() %>.webp" />
			<h3><%=produit.getPrix() %></h3>
			<p><%=produit.getCategorie().getCategorie() %></p>
		</div>
	<% } %>
	
</body>
</html>