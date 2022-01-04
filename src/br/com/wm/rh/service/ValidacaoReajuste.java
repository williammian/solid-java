package br.com.wm.rh.service;

import java.math.BigDecimal;

import br.com.wm.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);
	
}
