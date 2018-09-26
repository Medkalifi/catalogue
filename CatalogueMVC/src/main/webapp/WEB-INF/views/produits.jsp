<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>catalogue produits</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()
%>/resources/css/styles.css">
 
</head>
<body>
<div id="formProduits">
<f:form modelAttribute="produit" method="post" action="saveProduit">
	<table>
		<tr> 
				<td>Référence:</td>
				<td> <f:input path="reference"/></td>
				<td> <f:errors path="reference" cssClass="error"/></td>
	    </tr>
	    
	    <tr>
	    	<td> Designation :</td>
	    	<td> <f:input path="designation"/></td>
				<td> <f:errors path="designation" cssClass="error"/></td>
	    </tr>
	     <tr>
	    	<td> Quantité :</td>
	    	<td> <f:input path="quantite"/></td>
				<td> <f:errors path="quantite" cssClass="error"/></td>
	    </tr>
	    <tr>
	    	<td><input type="submit" value="Save"> </td>
	
		</tr>
		
		</table>
	</f:form>
	</div>
	
	<div id="listProduits">
	<table class="tabble1">
		<tr>
			<th> REF </th>
			<th> DESIGNATION </th>
			<th> PRIX </th>
			<th> QUANTITE </th>
		</tr>
<c:forEach items="${produits}" var="p">
	<tr>
		<td>${p.reference} </td>
		<td>${p.designation} </td>
		<td>${p.prix} </td>
		<td>${p.quantite} </td>
		<td> <a href="deleteProduit?ref=${p.reference}">Supprimer</a></td>
		<td> <a href="editProduit?ref=${p.reference}">Edit</a></td>
	</tr>
</c:forEach>
</table>
	</div>
	
</body>
</html>