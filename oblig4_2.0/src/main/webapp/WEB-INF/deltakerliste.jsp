<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link rel="stylesheet" href="./simple.css">
	<title>Deltagerliste</title>
</head>
<body>
    <p>Innlogget som: ${tlf}</p>
	<h2>Deltagerliste</h2>
	<table>
		<tbody><tr>
			<th align="left">Kjønn</th>
			<th align="left">Navn</th>
			<th align="left">Etternavn</th>
			<th align="left">Mobil</th>
		</tr>

		<c:forEach var="deltaker" items="${deltakere}"><tr>
            <tr style="background-color: #aaffaa; color: black;">
				<td>${deltaker.kjonn}</td>
				<td>${deltaker.fornavn}</td>
				<td>${deltaker.etternavn}</td>
				<td>${deltaker.tlf}</td>
			</tr>
		</c:forEach>

	</tbody></table>
	<br>
	<form action="/logout" method="post">
	   <button type="submit">Logg ut</button> 
	</form>

</body></html>