<%@page import="votation.DTO.Usuario"%>
<%@page import="votation.DAO.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String senha = request.getParameter("senha");

	String titulo = request.getParameter("titulo");

	String usuarioEleitor = request.getParameter("usuarioEleitor");

	UsuarioDAO usuarioDAO = new UsuarioDAO();
// 	System.out.println(titulo);
// 	System.out.println(senha);
	Usuario usuario = usuarioDAO.verificaUsuario(titulo, senha);
	if (usuario != null) {
		//System.out.println("1");
		if(Integer.parseInt(usuarioEleitor) == usuario.getIdUsuario()){
			// pode votar	
						//System.out.println("2");

			response.getWriter().write("1");	
		}else{
			//System.out.println("3");

			response.getWriter().write("0");	

		}
	} else {
		//System.out.println("4");

		response.getWriter().write("0");	
	}
%>