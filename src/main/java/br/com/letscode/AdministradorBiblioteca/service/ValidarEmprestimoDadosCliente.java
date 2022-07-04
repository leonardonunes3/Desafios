package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;

public class ValidarEmprestimoDadosCliente implements ValidarEmprestimo {
    @Override
    public void validar(Cliente cliente) {
        if ( cliente.getNome() == null || cliente.getEmail() == null || cliente.getTelefone() == null ) {
            throw new RuntimeException("Todos os dados do cliente devem estar preenchidos.");
        }
    }
}
