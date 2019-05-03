<%@page import="votation.DTO.Usuario"%>
<%@page import="votation.DAO.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	String numero = request.getParameter("numero");
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	Usuario usuario = usuarioDAO.getById(Integer.parseInt(numero));
	if (usuario != null) {
%>
	<input type="hidden" id="id_candidato" name="id_candidato"
		value="<%=usuario.getIdUsuario()%>">
<img src="<%=usuario.getUrlFoto()%>" height="180" width="180">
<br>
<h3><%=usuario.getNome()%></h3>
<button type="button" onClick='votar()' class="button primary">Confirmar</button>
<%
	}
%>