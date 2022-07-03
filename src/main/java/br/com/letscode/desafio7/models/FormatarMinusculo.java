package br.com.letscode.desafio7.models;

public class FormatarMinusculo implements Formatar {

    @Override
    public String formatar(String mensagem) {
        return mensagem.toLowerCase();
    }
}
