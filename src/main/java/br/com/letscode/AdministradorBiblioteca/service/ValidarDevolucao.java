package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;
import br.com.letscode.AdministradorBiblioteca.models.Livro;

import java.util.ArrayList;

public interface ValidarDevolucao {
    void validar(Cliente cliente, Livro livro, ArrayList<AcoesDevolucao> acoesDevolucao);
}
