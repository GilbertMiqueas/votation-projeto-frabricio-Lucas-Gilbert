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
		
	 </head>
<body>
	<div method="post" action="/votacao/index" class="is-center" style = 'display:flex; position:absolute; top:0; bottom:0; right:0; left:0; '>
		
			<fieldset>
				<legend>Relatório da sessão</legend>
				<p>
					
				</p>
				<p class="is-center">
					<input type="submit" value="Emitir relátorio">
					<a href='relatorio_voto.jsp'>
						<button>Voltar</button>
					</a>
				</p>
			</fieldset>
		
	</div>
</body>
</html>
