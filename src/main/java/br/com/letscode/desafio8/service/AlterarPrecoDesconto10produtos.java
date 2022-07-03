package br.com.letscode.desafio8.service;

import br.com.letscode.desafio8.models.CarrinhoCompras;

import java.math.BigDecimal;

public class AlterarPrecoDesconto10produtos implements AlterarPreco {

    @Override
    public void alterarPreco(CarrinhoCompras carrinhoCompras) {
        if(carrinhoCompras.getProdutos().size() >= 10 && carrinhoCompras.getProdutos().size() < 15) {
            System.out.println("Entre 10 e 15 produtos, aplicar 8% de desconto");
            carrinhoCompras.setTotalCompra(carrinhoCompras.getTotalCompra().multiply(BigDecimal.valueOf(0.92)));
        }
    }
}
