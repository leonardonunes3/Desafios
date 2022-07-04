package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;

public class ValidarEmprestimoAtrasos implements ValidarEmprestimo {
    @Override
    public void validar(Cliente cliente) {
        if(cliente.getEmprestimo().getQuantidadeAtrasos() >= 3) {
            throw new RuntimeException("Bloqueio de empréstimo até a data " +
                    cliente.getEmprestimo().getDataBloqueioFinaliza());
        }
    }
}
