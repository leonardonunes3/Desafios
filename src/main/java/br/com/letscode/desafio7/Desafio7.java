package br.com.letscode.desafio7;

import br.com.letscode.desafio7.models.Formatar;
import br.com.letscode.desafio7.models.FormatarMaiusculo;
import br.com.letscode.desafio7.models.FormatarRemoverAcentuacao;
import br.com.letscode.desafio7.service.SendEmailService;

import java.util.List;


public class Desafio7 {

        public static void main(String[] args) {

            List<Formatar> formatacoes = List.of(
                    new FormatarRemoverAcentuacao(),
                    new FormatarMaiusculo()
            );

            SendEmailService sendEmailService = new SendEmailService(formatacoes);
            sendEmailService.enviarEmail("Testando a formatação eM MaiúsCuLo");

            System.out.println("commit 1");

            System.out.println("commit 2");
        }

}
