package votation.controller;

import java.util.List;

import votation.DAO.CandidatoDAO;
import votation.DTO.Candidato;

public class CandidatoController {
	public List<Candidato> listarCandidatosPorNumero(String numero) {
		return new CandidatoDAO().listarCandidatosPorNumero(numero);
	}
}
