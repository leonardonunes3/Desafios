package br.com.letscode.desafio8.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Produto> produtos;
    private BigDecimal totalCompra;

    public CarrinhoCompras(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getTotalCompra() {
        return this.totalCompra;
    }

    public void setTotalCompra(BigDecimal totalCompra) {
        this.totalCompra = totalCompra;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
