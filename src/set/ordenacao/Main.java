package set.ordenacao;

public class Main {
    public static void main(String[] args) {
        // Criando o cadastro de produtos
        CadastroProdutos cadastro = new CadastroProdutos();

        // Adicionando produtos
        cadastro.adicionarProduto(101, "Notebook", 3500.00, 5);
        cadastro.adicionarProduto(102, "Smartphone", 2500.00, 10);
        cadastro.adicionarProduto(103, "Mouse", 150.00, 20);
        cadastro.adicionarProduto(104, "Teclado", 200.00, 15);
        cadastro.adicionarProduto(105, "Monitor", 1200.00, 8);

        // Exibindo produtos ordenados por nome
        System.out.println("Produtos ordenados por nome:");
        System.out.println(cadastro.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println("\nProdutos ordenados por preço:");
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}