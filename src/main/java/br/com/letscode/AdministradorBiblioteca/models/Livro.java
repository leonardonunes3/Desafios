package br.com.letscode.AdministradorBiblioteca.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Livro {

    private BigDecimal valorDiarioEmprestimo;
    private String nome;

    private LocalDateTime diaAluguel;

    private LocalDateTime diaDevolucao;

    public BigDecimal getValorDiarioEmprestimo() {
        return valorDiarioEmprestimo;
    }

    public void setValorDiarioEmprestimo(BigDecimal valorDiarioEmprestimo) {
        this.valorDiarioEmprestimo = valorDiarioEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDiaAluguel() {
        return diaAluguel;
    }

    public void setDiaAluguel(LocalDateTime diaAluguel) {
        this.diaAluguel = diaAluguel;
    }

    public LocalDateTime getDiaDevolucao() {
        return diaDevolucao;
    }

    public void setDiaDevolucao(LocalDateTime diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }
}
