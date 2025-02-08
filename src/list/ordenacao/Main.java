package list.ordenacao;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OrdenacaoPessas ordenacaoPessoas = new OrdenacaoPessas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 25, 1.68);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.75);
        ordenacaoPessoas.adicionarPessoa("Charlie", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("David", 28, 1.65);

        // Testando a ordenação por idade
        List<Pessoa> pessoasPorIdade = ordenacaoPessoas.ordenarPorIdade();
        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa pessoa : pessoasPorIdade) {
            System.out.println(pessoa);
        }

        // Testando a ordenação por altura
        List<Pessoa> pessoasPorAltura = ordenacaoPessoas.ordenarPorAltura();
        System.out.println("\nPessoas ordenadas por altura:");
        for (Pessoa pessoa : pessoasPorAltura) {
            System.out.println(pessoa);
        }
    }
}