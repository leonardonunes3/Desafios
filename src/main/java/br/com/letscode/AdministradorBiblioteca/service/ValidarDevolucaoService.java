package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;
import br.com.letscode.AdministradorBiblioteca.models.Livro;

import java.util.ArrayList;
import java.util.List;

public class ValidarDevolucaoService {

    private List<ValidarDevolucao> validarDevolucao;
    private ArrayList<AcoesDevolucao> acoesDevolucao;

    public ValidarDevolucaoService(List<ValidarDevolucao> validarDevolucao) {
        this.validarDevolucao = validarDevolucao;
        this.acoesDevolucao = new ArrayList<>();
    }

    public ArrayList<AcoesDevolucao> validarDevolucao(Cliente cliente, Livro livro) {
        for(ValidarDevolucao validacoes : validarDevolucao) {
            validacoes.validar(cliente, livro, this.acoesDevolucao);
        }

        return acoesDevolucao;
    }
}
