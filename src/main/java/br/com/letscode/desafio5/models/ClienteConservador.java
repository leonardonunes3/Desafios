package br.com.letscode.desafio5.models;

import java.util.ArrayList;

public class ClienteConservador extends PerfilCliente<RendaFixa> {

    public ClienteConservador() {
        investimentos = new ArrayList<>();
    }
    @Override
    public void contratarInvestimento(Investimento<RendaFixa> investimento) {
        this.investimentos.add(investimento);
    }
}
