<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Autenticar Voto</title>
		<link href="./css/autenticaVoto.css" rel="stylesheet" type="text/css">
		<link rel="stylesheet" href="https://unpkg.com/chota@latest">
		<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	 </head>
<body>
	<div  class="is-center" style = 'display:flex; position:absolute; top:0; bottom:0; right:0; left:0; '>
		
			<fieldset>
				<legend>Autenticar Voto</legend>
				<p>
					<label>Numero do Título do Eleitor:</label> <input type="text"
					id="titulo_eleitor"
						placeholder="Seu número" name="titulo" value="">
				</p>
				<p class="is-center">
					<input type="button" value="Autenticar" onclick="autenticarTitulo(this);">
					<a href='index.jsp'>
						<button>Voltar</button>
					</a>
				</p>
			</fieldset>
		 <input type="hidden" id="id_usuario_logado" name="id_usuario_logado" value="<%=session.getValue("idUsuario")%>">
		
		
	</div>
</body>
<script src="./js/autenticaVoto.js"></script>
</html>
