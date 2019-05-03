var rootURL = "http://localhost:8080/votacao/rest/";

function  buscarMunicipio(componente){
	sendGET("municipio/get_all/" + componente.value, "", sucessoBuscarMunicipio);
}
function sucessoBuscarMunicipio(data){
	var lista = JSON.parse(data);
	var select = "<label for='usuario_municipio'>Município</label><select class='custom-select' id='usuario_municipio' class='selectpicker' data-show-subtext='true' data-live-search='true'>";
	var fimSelect= "</select>"
	var option = "<option value=''>Selecione</option>";
	for(var i = 0; i < lista.length; i++){
		option += "<option value='"+lista[i].id+"'>"+lista[i].descricao+"</option>"
	}
	var conteudo = select + option + fimSelect;
	$("#div_usuario_municipio").empty();
	$("#div_usuario_municipio").append(conteudo);
	
}

function  buscarSecao(componente){
	sendGET("secao/get_all/" + componente.value, "", succesBuscarSecao);
}
function succesBuscarSecao(data){
	var lista = JSON.parse(data);
	var select = "<label for='usuario_secao'>Seção</label><select class='custom-select' id='usuario_secao' class='selectpicker' data-show-subtext='true' data-live-search='true'>";
	var fimSelect= "</select>"
	var option = "<option value=''>Selecione</option>";
	for(var i = 0; i < lista.length; i++){
		option += "<option value='"+lista[i].id+"'>"+lista[i].descricao+"</option>"
	}
	var conteudo = select + option + fimSelect;
	$("#div_usuario_secao").empty();
	$("#div_usuario_secao").append(conteudo);
	
}

function sendGET(url, data, sucesso) {
	$.ajax({
		url : rootURL + url,
		data : data,
		success : sucesso,
		dataType : "text",
		error:errorSendGET
	});
}

function errorSendGET(data){
	alert("ERRO: " + JSON.stringify(data));
}

function cadastrar(){
	var nome = $('#usuario_nome').val();
	var data = $('#usuario_data').val();
	var municipio = parseInt($('#usuario_municipio').val().trim());
	var tipoUsuario = $("#tipo_usuario").val();
	var senha =$("#usuario_senha").val();
	var usuarioDataEmissao = $("#usuario_data_emissao").val();
	var titulo = $("#usuario_titulo").val();
	var secao = $("#usuario_secao").val()
	
	$.ajax({
		type : "GET",
		url : "./ajax/ajax_salvar_usuario.jsp?nome=" + nome + "&data=" + data
		+ "&municipio=" + municipio + "&tipoUsuario=" + tipoUsuario + "&senha=" + senha
		+ "&usuarioDataEmissao=" + usuarioDataEmissao + "&titulo=" + titulo + "&secao=" + secao,
		dataType : "html",
		success : function(data) {
			alert("Salvo")
			return data;
		},
		error : function() {
			alert("ERRO")
		}
	});
}
