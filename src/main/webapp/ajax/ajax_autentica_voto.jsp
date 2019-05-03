<%@page import="java.util.Date"%>
<%@page import="votation.DAO.LogDAO"%>
<%@page import="votation.DTO.Log"%>
<%@page import="votation.DTO.Usuario"%>
<%@page import="votation.DAO.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String titulo_eleitor = request.getParameter("titulo_eleitor");
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	Usuario usuario = usuarioDAO.verificarTitulo(titulo_eleitor);
	Log log = new Log();
	LogDAO logDAO = new LogDAO();
	log.setData(new Date());
	log.setLog("Autenticou um Eleitor na Urna");
	log.setPagina("autenticaVoto.jsp");
	log.setUsuario(usuarioDAO.getById( Integer.parseInt(session.getValue("idUsuario").toString())));
	logDAO.save(log);
	if(usuario == null){
		response.getWriter().write("0");	
	}else{
		response.getWriter().write(usuario.getIdUsuario() + "");
	}
	 
%>