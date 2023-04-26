package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	public void reajustarSalariodoFuncionario(Funcionario funcionario, BigDecimal aumento) {
					
		BigDecimal salarioReajustado =  salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
