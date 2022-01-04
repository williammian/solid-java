package br.com.wm.rh.service.promocao;

import br.com.wm.rh.ValidacaoException;
import br.com.wm.rh.model.Cargo;
import br.com.wm.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if(Cargo.GERENTE.equals(cargoAtual)) {
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		}else {
			throw new ValidacaoException("Funcionário não bateu a meta!");
		}
	}

}
