package br.com.letscode.desafio6.models;

import java.util.ArrayList;

public class ClienteModerado extends PerfilCliente<RendaFixa> {

    public ClienteModerado() {
        investimentos = new ArrayList<>();
    }
    @Override
    public void contratarInvestimento(Investimento<RendaFixa> investimento) {
        this.investimentos.add(investimento);
    }
}
