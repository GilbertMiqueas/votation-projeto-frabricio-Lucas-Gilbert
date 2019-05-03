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
<title>Relatório Log</title>
<link rel="stylesheet" href="https://unpkg.com/chota@latest">
</head>
<body>
	<table class="striped">
		<tr>
			<th>Data</th>
			<th>Hora</th>
			<th>Usuário</th>
			<th>Log</th>
		</tr>
		<%
		SimpleDateFormat diaMesANo = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaMinuto = new SimpleDateFormat("HH:mm");

		LogDAO logDAO = new LogDAO();
		List<Log> listaLog = logDAO.listarTodos();
		for(Log log : listaLog){
		%>
		<tr>

			<td><%=diaMesANo.format(log.getData()) %></td>
			<td><%=horaMinuto.format(log.getData()) %></td>
			<td><%=log.getUsuario().getNome() %></td>
			<td><%=log.getLog()%></td>
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