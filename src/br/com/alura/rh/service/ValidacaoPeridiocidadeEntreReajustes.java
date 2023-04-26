package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeridiocidadeEntreReajustes implements ValidacaoReajuste{
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtua           = LocalDate.now();
		long mesesDesseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtua);
		
		if(mesesDesseUltimoReajuste < 6 ) {
			throw new ValidacaoException("Reajuste deve ser de no mínimo 6 meses");
		}
	}

}
