package br.com.letscode.desafio8;

import br.com.letscode.desafio8.models.CarrinhoCompras;
import br.com.letscode.desafio8.models.Produto;
import br.com.letscode.desafio8.service.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setPrecoProduto(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setPrecoProduto(BigDecimal.valueOf(80));

        Produto produto3 = new Produto();
        produto3.setPrecoProduto(BigDecimal.valueOf(50));

        Produto produto4 = new Produto();
        produto4.setPrecoProduto(BigDecimal.valueOf(35));

        Produto produto5 = new Produto();
        produto5.setPrecoProduto(BigDecimal.valueOf(299));

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras(produtos);

        CalcularTotalCarrinhoService calcularTotalCarrinhoService = new CalcularTotalCarrinhoService();
        calcularTotalCarrinhoService.calcularTotalCarrinho(carrinhoCompras);

        List<AlterarPreco> alterarPrecos = List.of(new AlterarPrecoDesconto5produtos(),
                new AlterarPrecoDesconto10produtos(), new AlterarPrecoDesconto15produtos());

        CalcularDescontoService calcularDescontoService = new CalcularDescontoService(alterarPrecos);
        calcularDescontoService.calcularDesconto(carrinhoCompras);
    }
}
