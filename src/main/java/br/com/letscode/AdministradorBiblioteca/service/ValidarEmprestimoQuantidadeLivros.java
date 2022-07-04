package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;

public class ValidarEmprestimoQuantidadeLivros implements ValidarEmprestimo {

    @Override
    public void validar(Cliente cliente) {
        if(cliente.getEmprestimo().getLivrosEmprestados().size() >= 2) {
            throw new RuntimeException("Limite de 2 livros em empréstimo ao mesmo tempo alcançado.");
        }
    }
}
