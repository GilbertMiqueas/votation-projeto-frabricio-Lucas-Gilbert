function autenticarTitulo(){
	
	var titulo_eleitor = $("#titulo_eleitor").val()
	var id_usuario_logado = $("#id_usuario_logado").val();

	$.ajax({
		type : "GET",
		url : "./ajax/ajax_autentica_voto.jsp?titulo_eleitor=" + titulo_eleitor,
		dataType : "html",
		success : function(data) {
		if(data.trim() != "0"){
			document.location.href = "voto.jsp?eleitor=" + data.trim()
		}else{
			alert("Título Inválido")
		}
			return data;
		},
		error : function() {
			alert("ERRO!")
		}
	});
}