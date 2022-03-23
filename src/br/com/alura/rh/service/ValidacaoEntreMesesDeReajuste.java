package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoEntreMesesDeReajuste implements ValidacaoReajuste {

    public void ValidacaoReajuste(Funcionario funcionario, BigDecimal aumento){

        //regra de negocio para validar o tempo entre um aumento e outro
        LocalDate dataDoUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesEntreOsReajustes = ChronoUnit.MONTHS.between(dataAtual, dataDoUltimoReajuste);
        if(mesesEntreOsReajustes < 6){
            throw new ValidacaoException("Tempo entre um reajuste e outro não pode ser menor que 6 meses");
        }

    }
}
