package br.com.wm.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.wm.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
