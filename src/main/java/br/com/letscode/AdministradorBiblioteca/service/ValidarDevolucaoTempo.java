package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;
import br.com.letscode.AdministradorBiblioteca.models.Livro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.time.temporal.ChronoUnit.DAYS;

public class ValidarDevolucaoTempo implements ValidarDevolucao {

    @Override
    public void validar(Cliente cliente, Livro livro, ArrayList<AcoesDevolucao> acoesDevolucao) {
        List<Livro> livrosEmprestados = cliente.getEmprestimo().getLivrosEmprestados();
        for(Livro livros : livrosEmprestados) {
            if(Objects.equals(livros.getNome(), livro.getNome())) {
                livros.setDiaDevolucao(LocalDateTime.now());
                if(livros.getDiaAluguel().until(livros.getDiaDevolucao(), DAYS) > 20) {
                    AcoesDevolucaoMulta acoes = new AcoesDevolucaoMulta();
                    acoes.setTempoDiasAluguel((int)
                            livros.getDiaAluguel().until(livros.getDiaDevolucao(), DAYS));
                    acoesDevolucao.add(acoes);
                }
            }
        }
    }
}
