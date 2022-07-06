package br.com.letscode.AdministradorBiblioteca.service;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;
import br.com.letscode.AdministradorBiblioteca.models.Livro;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class EmprestimoService {

    public void realizarEmprestimo(Cliente cliente, Livro livro) {

        List<ValidarEmprestimo> validarEmprestimo = List.of( new ValidarEmprestimoAtrasos(),
                new ValidarEmprestimoDadosCliente(), new ValidarEmprestimoQuantidadeLivros());

        ValidarEmprestimoService validarEmprestimoService = new ValidarEmprestimoService(validarEmprestimo);
        validarEmprestimoService.validarEmprestimo(cliente);


        livro.setDiaAluguel(LocalDateTime.now());
        cliente.getEmprestimo().getLivrosEmprestados().add(livro);
    }

    public void devolverLivro(Cliente cliente, Livro livro) {
        BigDecimal valorTotalEmprestimo;

        livro.setDiaDevolucao(LocalDateTime.now());

        List<ValidarDevolucao> validarDevolucoes = List.of(new ValidarDevolucaoTempo());
        ValidarDevolucaoService validarDevolucaoService = new ValidarDevolucaoService(validarDevolucoes);
        List<AcoesDevolucao> acoesDevolucao =  validarDevolucaoService.validarDevolucao(cliente, livro);


        valorTotalEmprestimo = livro.getValorDiarioEmprestimo().multiply(
                BigDecimal.valueOf(livro.getDiaAluguel().until(livro.getDiaDevolucao(), DAYS)));

        for (AcoesDevolucao acoes : acoesDevolucao) {
            if(acoes instanceof AcoesDevolucaoMulta) {
                valorTotalEmprestimo = livro.getValorDiarioEmprestimo().multiply(
                        BigDecimal.valueOf(((AcoesDevolucaoMulta) acoes).getTempoDiasAluguel())).add(
                        ((AcoesDevolucaoMulta) acoes).valorMulta(livro));

                cliente.getEmprestimo().aumentarQuantidadeAtrasos();
                if(cliente.getEmprestimo().getQuantidadeAtrasos() == 3) {
                    cliente.getEmprestimo().setDataBloqueioFinaliza(LocalDateTime.now().plusMonths(1L));
                }
            }
        }


        System.out.println("Valor total do empréstimo: " + valorTotalEmprestimo);
        ArrayList<Livro> livrosEmprestados = cliente.getEmprestimo().getLivrosEmprestados();
        for (int i = 0; i < livrosEmprestados.size(); i++) {
            if(livrosEmprestados.get(i).equals(livro)) {
                livrosEmprestados.remove(i);
                cliente.getEmprestimo().setLivrosEmprestados(livrosEmprestados);
            }
        }
    }

    //TO-DO:
    public void desbloquearEmprestimo(Cliente cliente) {

    }

}

