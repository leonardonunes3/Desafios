package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;

import java.util.List;

public class ValidarEmprestimoService {

    private List<ValidarEmprestimo> validarEmprestimo;

    public ValidarEmprestimoService(List<ValidarEmprestimo> validarEmprestimo) {
        this.validarEmprestimo = validarEmprestimo;
    }

    public void validarEmprestimo(Cliente cliente) {
        for(ValidarEmprestimo validacoes : validarEmprestimo) {
            validacoes.validar(cliente);
        }
    }
}
