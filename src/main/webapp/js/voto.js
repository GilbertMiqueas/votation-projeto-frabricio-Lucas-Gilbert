function buscarCandidato(component){
	if (component.value == "") {
		$("#candidato").html("")
	} else {
		$.ajax({
			url : "./ajax/ajax_buscar_candidato.jsp?numero=" + component.value,
			type : "GET",
			async : true,
			success : function(responseText) {
				$("#candidato").html(responseText)
			},
			error : function(responseText) {
			}
		});
	}
}

function limpar(){
	$("#numero_candidato").val("");
	$("#candidatos").html("")
}

function digitar(number){
	var numero = $("#numero_candidato").val();
	numero += number;
	$("#numero_candidato").val(numero);
	buscarCandidato(numero);
}

function votar(){
	$.ajax({ 
		url : "./ajax/ajax_votar.jsp?candidato=" + $("#id_candidato").val() + "&usuarioSecao=" + $("#id_usuario_logado").val()
		+ "&usuarioEleitor=" + $("#eleitor").val(),
		type : "GET",
		async : true,
		success : function(responseText) {
			//$("#candidato").html(responseText)
		},
		error : function(responseText) {
		}
	});
}

function logar(){
	$.ajax({
		url : "./ajax/ajax_logar.jsp?titulo=" + $("#titulo_logar").val() + "&senha=" + $("#senha").val()
		+ "&usuarioEleitor=" + $("#eleitor").val(),
		type : "GET",
		async : true,
		success : function(responseText) {
			alert(responseText)
			if(responseText.trim() == "1"){
				var modal = document.getElementById("modal_login");
				modal.style.display = "none";
			}else{
				alert("Não foi possível autenticar a seção");
			}
		},
		error : function(responseText) {
		}
	});
}