package br.com.letscode.AdministradorBiblioteca;

import br.com.letscode.AdministradorBiblioteca.models.Cliente;
import br.com.letscode.AdministradorBiblioteca.models.Livro;
import br.com.letscode.AdministradorBiblioteca.service.EmprestimoService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        cliente.setNome("Leo");
        cliente.setEmail("email@gmail.com");
        cliente.setTelefone("123456789");

        livro1.setNome("Moby Dick");
        livro1.setValorDiarioEmprestimo(BigDecimal.valueOf(2.5));

        livro2.setNome("Clean code");
        livro2.setValorDiarioEmprestimo(BigDecimal.valueOf(3.5));

        livro3.setNome("SOLID");
        livro3.setValorDiarioEmprestimo(BigDecimal.valueOf(4.5));

        EmprestimoService emprestimoService = new EmprestimoService();
        emprestimoService.realizarEmprestimo(cliente, livro1);
        emprestimoService.realizarEmprestimo(cliente, livro2);

        livro1.setDiaAluguel(LocalDateTime.now().minusDays(25L));
        emprestimoService.devolverLivro(cliente, livro1);
        emprestimoService.realizarEmprestimo(cliente, livro3);

        System.out.println(cliente.getEmprestimo().getLivrosEmprestados().get(0).getNome());
        System.out.println(cliente.getEmprestimo().getLivrosEmprestados().get(0).getDiaAluguel());
        System.out.println(cliente.getEmprestimo().getLivrosEmprestados().get(0).getValorDiarioEmprestimo());

    }
}
