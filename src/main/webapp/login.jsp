<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Login</title>
		<!-- <link href="./css/login.css" rel="stylesheet" type="text/css">  -->
		<link rel="stylesheet" href="https://unpkg.com/chota@latest">
		
	 </head>
<body>
	<div class="is-center" style = 'display:flex; position:absolute; top:0; bottom:0; right:0; left:0; '>
		<form method="post" action="Logar">
			<fieldset>
				<legend>Login</legend>
				<p>
					<label>Numero do T�tulo:</label> <input type="text"
						placeholder="Seu n�mero" name="numeroTitulo" value="">
				</p>
				<p>
					<label>Senha:</label> <input type="password"
						placeholder="Escreva sua senha" name="senha" value="">
				</p>
				<p class="is-center">
					<button type="submit">Login</button>
				</p>
			</fieldset>
		</form>
	</div>

</body>
</html>
