package br.com.letscode.desafio7.models;

public class FormatarCamelCase implements Formatar {

    public String formatar(String mensagem) {
        String[] palavras = mensagem.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < palavras.length; ++i) {
            String word = palavras[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }

            builder.append(word);
        }

        return builder.toString();
    }
}
