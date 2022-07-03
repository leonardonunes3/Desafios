package br.com.letscode.desafio8.service;

import br.com.letscode.desafio8.models.CarrinhoCompras;

import java.math.BigDecimal;

public class AlterarPrecoDesconto15produtos implements AlterarPreco {

    @Override
    public void alterarPreco(CarrinhoCompras carrinhoCompras) {
        if(carrinhoCompras.getProdutos().size() >= 15) {
            System.out.println("15 produtos ou mais, aplicar 10% de desconto");
            carrinhoCompras.setTotalCompra(carrinhoCompras.getTotalCompra().multiply(BigDecimal.valueOf(0.90)));
        }
    }
}
