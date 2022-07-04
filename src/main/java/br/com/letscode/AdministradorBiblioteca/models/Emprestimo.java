package br.com.letscode.AdministradorBiblioteca.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Emprestimo {

    private ArrayList<Livro> livrosEmprestados;

    private Integer quantidadeAtrasos;

    private LocalDateTime dataBloqueioFinaliza;

    public Emprestimo() {
        livrosEmprestados = new ArrayList<>();
        this.quantidadeAtrasos = 0;
    }

    public Integer getQuantidadeAtrasos() {
        return quantidadeAtrasos;
    }

    public void aumentarQuantidadeAtrasos() {
        this.quantidadeAtrasos += 1;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public LocalDateTime getDataBloqueioFinaliza() {
        return dataBloqueioFinaliza;
    }

    public void setDataBloqueioFinaliza(LocalDateTime dataBloqueioFinaliza) {
        this.dataBloqueioFinaliza = dataBloqueioFinaliza;
    }
}
