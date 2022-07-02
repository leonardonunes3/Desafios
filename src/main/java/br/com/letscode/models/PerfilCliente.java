package br.com.letscode.models;

import java.util.ArrayList;
import java.util.List;

public abstract class PerfilCliente<T> {

    List<Investimento> investimentos;
    abstract public void contratarInvestimento(Investimento<T> investimento);

    public List<Investimento> getCarteiraInvestimentos() {
        return this.investimentos;
    }
}
