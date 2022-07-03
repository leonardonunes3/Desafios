package br.com.letscode.desafio7.service;

import br.com.letscode.desafio7.models.Formatar;
import java.util.List;

public class SendEmailService {
    private List<Formatar> formatacoes;

    public SendEmailService(List<Formatar> formatacoes) {
        this.formatacoes = formatacoes;
    }

    public void enviarEmail(String mensagem) {

        for (Formatar formatar : formatacoes) {
            mensagem = formatar.formatar(mensagem);
        }

        System.out.println("Enviando email com a mensagem formatada: " + mensagem);
    }

}
