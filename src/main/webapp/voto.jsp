<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="./css/voto.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://unpkg.com/chota@latest">

<meta charset="ISO-8859-1">
<script src="./js/voto.js" type="text/javascript"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Pagina de votação</title>
</head>
<body>
	<input type="hidden" id="id_usuario_logado" name="id_usuario_logado"
		value="<%=session.getValue("idUsuario")%>">
	<input type="hidden" id="eleitor" name="eleitor"
		value="<%=request.getParameter("eleitor")%>">

	<div class="screen">
		<div>
			<h3 class="title">Digite o número do seu candidato</h3>
		</div>
		<div>
			<input id="numero_candidato" type="number"
				onkeyup="buscarCandidato(this);">
		</div>

		<div id="candidato" style="width: 100%; text-align: center"></div>

	</div>

	<!-- The Modal -->
	<div class="modal" id="modal_login" role="dialog"
		style="min-width: 1024px !important;">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Autenticação de Login</h4>
				</div>
				<div class="modal-body">
					<label>Título</label> 
					<input type="text" id="titulo_logar"> 
					<label>Senha</label> 
					<input type="text" id="senha" >
				</div>
				<div class="modal-footer">
					<button type="button" onClick='logar()' class="button primary pull-left">Confirmar</button>
					<a href='index.jsp'>
						<button>Voltar</button>
					</a>
				</div>
			</div>

		</div>
	</div>
</body>
<script src="./vendor/jquery/jquery.min.js"></script>

<script>
	$(document).ready(function() {
		var modal = document.getElementById("modal_login");
		modal.style.display = "block";
	});
</script>

</html>
