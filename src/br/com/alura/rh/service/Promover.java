package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class Promover {

    public void promoverFuncionario(Funcionario funcionario, Boolean metaAtingida){
        if(funcionario.getDadosPessoais().getCargo().equals(Cargo.GERENTE)){
            throw new ValidacaoException("Gerente não pode ser promovido");
        }

        if(metaAtingida){
            Cargo novoCargo = funcionario.getDadosPessoais().getCargo().getProximoCargo();
            funcionario.atualizarCargo(novoCargo);
        }else{
            throw new ValidacaoException("A meta não foi atingida");
        }
    }
}
