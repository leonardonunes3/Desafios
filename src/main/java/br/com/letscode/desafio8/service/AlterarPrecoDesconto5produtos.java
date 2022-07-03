package br.com.letscode.desafio8.service;

import br.com.letscode.desafio8.models.CarrinhoCompras;

import java.math.BigDecimal;

public class AlterarPrecoDesconto5produtos implements AlterarPreco {

    @Override
    public void alterarPreco(CarrinhoCompras carrinhoCompras) {
        if(carrinhoCompras.getProdutos().size() >= 5 && carrinhoCompras.getProdutos().size() < 10) {
            System.out.println("Entre 5 e 10 produtos, aplicar 5% de desconto");
            carrinhoCompras.setTotalCompra(carrinhoCompras.getTotalCompra().multiply(BigDecimal.valueOf(0.95)));
        }
    }
}
