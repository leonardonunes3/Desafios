package br.com.letscode.desafio5.models;

import java.util.List;

public abstract class PerfilCliente<T> {

    List<Investimento> investimentos;
    abstract public void contratarInvestimento(Investimento<T> investimento);

    public List<Investimento> getCarteiraInvestimentos() {
        return this.investimentos;
    }
}
