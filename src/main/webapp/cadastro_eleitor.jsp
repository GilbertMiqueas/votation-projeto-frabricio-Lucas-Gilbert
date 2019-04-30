<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://unpkg.com/chota@latest">
<title>Cadastro de Eleitor</title>
</head>
<body>
<h2 class="is-text-center">Cadastro de Eleitor</h2>
	<form method="POST">
		<p>
				<label >Nome</label> 
				<input type="text" placeholder="Coloque o nome">
			</p>
			<p>
				<label >Sobrenome</label> 
				<input  type="text" placeholder="Coloque o Sobrenome">
			</p>
			<p>
              <label >Data de nascimento</label>
              <input type="date" id="idd" value="2019-01-01">
            </p>
			<p>
				<label for="input__text">Município</label> 
				<input id="input__text" type="text" placeholder="Coloque o Município">
			</p>
			<p>
              <label >UF</label>
              <select id="select">
                  <optgroup label="Option Group">
                    <option>Acre (AC)</option>
                    <option>Rio de Janeiro (RJ)</option>
                    <option>São Paulo (SP)</option>
                  </optgroup>
                </select>
            </p>
            <p>
				<label >Número de Título</label> <input
					 type="number" placeholder="Coloque um número">
			</p>
			<p>
              <label >Data de emissão</label>
              <input type="date"  value="2019-01-01">
            </p>
			<p>
				<label >Zona eleitoral</label> 
				<input type="text" placeholder="Coloque uma Zona eleitoral">
			</p><p>
				<label >Seção eleitoral</label> 
				<input  type="text" placeholder="Coloque uma Seção eleitoral">
			</p>
				<p>
				<label >Senha</label> <input
					 type="password"
					placeholder="Digite uma senha">
			</p>
			<div class='is-center'>
			<button type="submit"  class="button primary">Confirmar</button>
				<a href='index.jsp'>
					<button type="button" class="button primary">Voltar</button>
				</a>
			</div>
		
	</form>
	
</body>
</html>