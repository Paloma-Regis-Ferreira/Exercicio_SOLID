package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    public void ValidacaoReajuste(Funcionario funcionario, BigDecimal aumento);
}
