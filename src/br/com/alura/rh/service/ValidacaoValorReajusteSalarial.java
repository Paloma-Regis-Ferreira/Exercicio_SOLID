package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoValorReajusteSalarial implements ValidacaoReajuste{

    public void ValidacaoReajuste(Funcionario funcionario, BigDecimal aumento) {
        //regra de negocio para validar aumento de salario em valor
        BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
    }
}
