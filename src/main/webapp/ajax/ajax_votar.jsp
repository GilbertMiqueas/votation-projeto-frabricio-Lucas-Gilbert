<%@page import="java.util.Date"%>
<%@page import="votation.DAO.UsuarioVotoDAO"%>
<%@page import="votation.DTO.UsuarioVoto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String cadidato = request.getParameter("candidato");
String usuarioSecao = request.getParameter("usuarioSecao");
String usuarioEleitor = request.getParameter("usuarioEleitor");
UsuarioVoto usuarioVoto = new UsuarioVoto();
UsuarioVotoDAO usuarioVotoDAO = new UsuarioVotoDAO();
usuarioVoto.setData(new Date());
usuarioVoto.setNumeroCanditado(Integer.parseInt(cadidato));
usuarioVoto.setUsuario(Integer.parseInt(usuarioEleitor));
usuarioVoto.setUsuarioSecao(Integer.parseInt(usuarioSecao));
usuarioVotoDAO.save(usuarioVoto);

%>