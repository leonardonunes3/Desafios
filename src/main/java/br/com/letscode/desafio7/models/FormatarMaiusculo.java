package br.com.letscode.desafio7.models;

public class FormatarMaiusculo implements Formatar {

    @Override
    public String formatar(String mensagem) {
        return mensagem.toUpperCase();
    }

}
