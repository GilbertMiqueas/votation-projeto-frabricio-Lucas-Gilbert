<%@page import="votation.DTO.UsuarioVoto"%>
<%@page import="votation.DAO.UsuarioVotoDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="votation.DAO.LogDAO"%>
<%@page import="votation.DTO.Log"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Relatório de Votos</title>
<link rel="stylesheet" href="https://unpkg.com/chota@latest">
</head>
<body>
	<table class="striped">
		<tr>
			<th>Nome do Candidato</th>
			<th>Quantidade de votos</th>

		</tr>
		<%
		UsuarioVotoDAO usuarioVotoDAO = new UsuarioVotoDAO();
		List<UsuarioVoto> listaUsuarioVoto = usuarioVotoDAO.listarTodos();
		for(UsuarioVoto usuarioVoto : listaUsuarioVoto){
		%>
		<tr>
			<td><%=usuarioVoto.getNumeroCanditado() %></td>
		</tr>
		<%	
		} %>
	</table>
	
	<div class='is-center'>
		<a href='menu_tre.jsp'>
			<button type="button" class="button primary">Voltar</button>
		</a>
	</div>

</body>
</html>