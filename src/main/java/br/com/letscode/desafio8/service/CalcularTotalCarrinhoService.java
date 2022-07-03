package br.com.letscode.desafio8.service;

import br.com.letscode.desafio8.models.CarrinhoCompras;
import br.com.letscode.desafio8.models.Produto;

import java.math.BigDecimal;


public class CalcularTotalCarrinhoService {

    public BigDecimal calcularTotalCarrinho(CarrinhoCompras carrinhoCompras) {

        BigDecimal totalCarrinho = BigDecimal.ZERO;

        for(Produto produtos : carrinhoCompras.getProdutos()) {
            totalCarrinho = totalCarrinho.add(produtos.getPrecoProduto());
        }

        carrinhoCompras.setTotalCompra(totalCarrinho);

        return totalCarrinho;
    }
}
