package br.com.letscode.AdministradorBiblioteca.service;

import java.time.LocalDateTime;

public class AcoesDevolucaoMulta implements AcoesDevolucao {

    private int tempoDiasAluguel;

    public int getTempoDiasAluguel() {
        return tempoDiasAluguel;
    }

    public void setTempoDiasAluguel(int tempoDiasAluguel) {
        this.tempoDiasAluguel = tempoDiasAluguel;
    }
}
