<%@page import="votation.DTO.Candidato"%>
<%@page import="java.util.List"%>
<%@page import="votation.controller.CandidatoController"%>
<%
	String numero = request.getParameter("numero");
	System.out.println(numero);
	CandidatoController candidatoController = new CandidatoController();
	List<Candidato> lista = candidatoController.listarCandidatosPorNumero(numero);
	for (Candidato candidato : lista) {
%>
<div >
	<h3 style="float:left">
		<%=candidato.getNome()%></h3>
	<img style="max-width: 100px;max-height: 150px; " src="<%=candidato.getFoto()%>">
</div>
<%
	}
%>

