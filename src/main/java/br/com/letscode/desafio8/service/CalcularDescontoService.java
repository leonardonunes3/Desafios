package br.com.letscode.desafio8.service;

import br.com.letscode.desafio8.models.CarrinhoCompras;

import java.util.List;

public class CalcularDescontoService {

    private List<AlterarPreco> alterarPreco;

    public CalcularDescontoService(List<AlterarPreco> alterarPreco) {
        this.alterarPreco = alterarPreco;
    }

    public void calcularDesconto(CarrinhoCompras carrinhoCompras) {
        System.out.println("Preço antes dos descontos: " + carrinhoCompras.getTotalCompra());
        for(AlterarPreco aplicarDesconto : alterarPreco) {
            aplicarDesconto.alterarPreco(carrinhoCompras);
        }
        System.out.println("Preço depois dos descontos: " + carrinhoCompras.getTotalCompra());
    }

}
