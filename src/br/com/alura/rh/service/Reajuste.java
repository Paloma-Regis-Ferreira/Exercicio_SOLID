package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class Reajuste {

    private List<ValidacaoReajuste> validacoes;

    public Reajuste(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    //vai de fato efetuar as validações e o reajuste
    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.ValidacaoReajuste(funcionario, aumento));

        funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
    }

}
