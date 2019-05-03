<%@page import="votation.DAO.ZonaDAO"%>
<%@page import="votation.DTO.Zona"%>
<%@page import="votation.DAO.TipoUsuarioDAO"%>
<%@page import="votation.DTO.TipoUsuario"%>
<%@page import="votation.DTO.Uf"%>
<%@page import="votation.DAO.UfDAO"%>
<%@page import="votation.service.UsuarioService"%>
<%@page import="votation.DTO.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://unpkg.com/chota@latest">
<title>Cadastro de Eleitor</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<h2 class="is-text-center">Cadastro de Eleitor</h2>
	<p>
		<label>Nome</label> <input type="text" id="usuario_nome"
			placeholder="Coloque o nome">
	</p>
	<p>
		<label>Data de nascimento</label> <input type="date" id="usuario_data"
			value="2019-01-01">
	</p>

	<p>
		<label>Data de emissão</label> <input type="date"
			id="usuario_data_emissao" value="2019-01-01">
	</p>
	<p>
		<label>UF</label> <select onClick='buscarMunicipio(this)'>
			<%
				List<Uf> listaUf = new UfDAO().listarTodos();
				for (Uf uf : listaUf) {
			%>
			<option value="<%=uf.getIdUf()%>"><%=uf.getNome()%></option>
			<%
				}
			%>
		</select>
	</p>
	<p>
	<div id='div_usuario_municipio'></div>
	</p>
	<p>
		<label>Tipo de Usuário</label> <select id="tipo_usuario">
			<%
				List<TipoUsuario> listaTipoUsuario = new TipoUsuarioDAO().listarTodos();
				for (TipoUsuario tipo : listaTipoUsuario) {
			%>
			<option value="<%=tipo.getIdTipoUsuario()%>"><%=tipo.getDescricao()%></option>
			<%
				}
			%>
		</select>
	</p>

	<p>
		<label>Zona</label> <select onClick='buscarSecao(this)'>
			<%
				List<Zona> listaZona = new ZonaDAO().listarTodos();
				for (Zona zona : listaZona) {
			%>
			<option value="<%=zona.getIdZona()%>"><%=zona.getNome()%></option>
			<%
				}
			%>
		</select>
	</p>
<p>
	<div id='div_usuario_secao'></div>
	</p>
	<p>
		<label>Senha</label> <input type="password" id="usuario_senha"
			placeholder="Digite uma Senha">
	</p>

	<p>
		<label>Número de Título</label> <input type="text" id="usuario_titulo"
			placeholder="Digite o Título do Usuário">
	</p>

	<div class='is-center'>
		<button type="submit" onClick='cadastrar()' class="button primary">Confirmar</button>
		<a href='menu_tre.jsp'>
			<button type="button" class="button primary">Voltar</button>
		</a>
	</div>

</body>
<script src="./vendor/jquery/jquery.min.js"></script>
<script type="text/javascript" src='./js/cadastro.js'></script>
</html>