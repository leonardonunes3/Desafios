package br.com.letscode.desafio7.models;

import java.text.Normalizer;

public class FormatarRemoverAcentuacao implements Formatar {

        @Override
        public String formatar(String mensagem) {
                return Normalizer.normalize(mensagem, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        }
}
