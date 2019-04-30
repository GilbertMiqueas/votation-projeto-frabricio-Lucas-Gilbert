function buscarCandidato(numero){
	$.ajax({
        url: "./util/ajax_voto.jsp?numero="+numero,
        type: "GET",
        async: true,
        success:function(responseText){
			$("#candidatos").html(responseText)
        },
        error:function(responseText){
        	alertify.error("Erro nas funções do Ajax.\nCódigo do erro: " + responseText.status);
		}
    });

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