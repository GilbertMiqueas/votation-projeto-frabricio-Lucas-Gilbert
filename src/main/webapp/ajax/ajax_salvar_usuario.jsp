<%@page import="votation.object.ObjectUsuario"%>
<%@page import="votation.service.UsuarioService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String nome = request.getParameter("nome");
String data = request.getParameter("data");
String municipio = request.getParameter("municipio");
String tipoUsuario = request.getParameter("tipoUsuario");
String senha = request.getParameter("senha");
String usuarioDataEmissao = request.getParameter("usuarioDataEmissao");
String titulo  = request.getParameter("titulo");
String secao = request.getParameter("secao");

UsuarioService usuarioService = new UsuarioService();
ObjectUsuario objectUsuario = new ObjectUsuario();
objectUsuario.setData(data);
objectUsuario.setDataEmissao(usuarioDataEmissao);
objectUsuario.setMunicipio(Integer.parseInt(municipio));
objectUsuario.setNome(nome);
objectUsuario.setTipoUsuario(Integer.parseInt(tipoUsuario));
objectUsuario.setNumeroTitulo(titulo);
objectUsuario.setSenha(senha);
objectUsuario.setSecaoEleitoral(Integer.parseInt(secao));
usuarioService.add(objectUsuario);

%>
