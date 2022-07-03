package br.com.letscode.desafio5.models;

import java.util.ArrayList;

public class ClienteArrojado extends PerfilCliente<RendaVariavel> {

    public ClienteArrojado() {
        investimentos = new ArrayList<>();
    }
    @Override
    public void contratarInvestimento(Investimento<RendaVariavel> investimento) {
        this.investimentos.add(investimento);
    }
}
