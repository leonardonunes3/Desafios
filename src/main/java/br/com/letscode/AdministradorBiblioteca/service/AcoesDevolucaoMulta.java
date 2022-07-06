package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Livro;

import java.math.BigDecimal;

public class AcoesDevolucaoMulta implements AcoesDevolucao {

    private int tempoDiasAluguel;

    public int getTempoDiasAluguel() {
        return tempoDiasAluguel;
    }

    public void setTempoDiasAluguel(int tempoDiasAluguel) {
        this.tempoDiasAluguel = tempoDiasAluguel;
    }

    public BigDecimal valorMulta(Livro livro) {
        BigDecimal valorMaximoMulta = BigDecimal.valueOf(0.2).multiply(
                BigDecimal.valueOf(tempoDiasAluguel)).multiply(
                        livro.getValorDiarioEmprestimo());

        BigDecimal multa = BigDecimal.valueOf(0.005).multiply(BigDecimal.valueOf(tempoDiasAluguel).pow(2)).multiply(livro.getValorDiarioEmprestimo());

        if(multa.compareTo(valorMaximoMulta) >= 1) {
            return valorMaximoMulta;
        }

        return multa;
    }
}
