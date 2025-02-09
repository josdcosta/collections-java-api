package map.pesquisa;

import map.opbasica.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 5, 3500.0);
        estoque.adicionarProduto(2L, "Smartphone", 10, 2000.0);
        estoque.adicionarProduto(3L, "Monitor", 7, 900.0);
        estoque.adicionarProduto(4L, "Mouse", 15, 120.0);
        estoque.adicionarProduto(5L, "Teclado", 8, 200.0);

        // Exibir todos os produtos
        System.out.println("Produtos no estoque:");
        estoque.exibirProdutos();

        // Exibir valor total do estoque
        System.out.println("\nValor total do estoque: R$ " + estoque.calcularValorTotalEstoque());

        // Obter e exibir o produto mais caro
        System.out.println("\nProduto mais caro: " + estoque.obterProdutoMaisCaro());

        // Obter e exibir o produto mais barato
        System.out.println("\nProduto mais barato: " + estoque.obterProdutoMaisBarato());

        // Obter e exibir o produto com maior valor total no estoque
        System.out.println("\nProduto com maior quantidade * valor: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}