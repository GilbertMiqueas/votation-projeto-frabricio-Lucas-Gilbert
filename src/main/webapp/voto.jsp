<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="./css/voto.css" rel="stylesheet" type="text/css">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="https://unpkg.com/chota@latest">

<meta charset="ISO-8859-1">
<script src="./js/voto.js" type="text/javascript"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Meu Voto</title>

</head>
<body>
	
	<div id="candidatos"></div>
	<div class="container cent">
	<div class="is-center row">
			<div class="col-12">
				<input value="" id="numero_candidato" type="number" disabled>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1">
				<button class='button outline dark' onclick="digitar(1)">1</button>
			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(2)">2</button>
			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(3)">3</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(4)">4</button>
			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(5)">5</button>
			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(6)">6</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(7)">7</button>
			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(8)">8</button>
			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(9)">9</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1">
				<button class="button dark" onclick="limpar()">Limpar</button>

			</div>
			<div class="col-md-1">
				<button class="button outline dark" onclick="digitar(0)">0</button>
			</div>
			<div class="col-md-1">
				<button onClick='alert("Voto comfirmado!!!")'  class="button dark">Comfirmar</button>
			</div>
		</div>
	</div>
	<div></div>

</body>


</html>
