package br.com.letscode.AdministradorBiblioteca.models;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;

    private Emprestimo emprestimo;

    public Cliente() {
        emprestimo = new Emprestimo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

}
