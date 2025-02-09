package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private long cod;
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto: estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getQuantidade()*produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto: estoqueProdutosMap.values()){
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto: estoqueProdutosMap.values()){
                if(produto.getPreco() < menorPreco){
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValor = null;
        double maiorQuantidadeValor = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto: estoqueProdutosMap.values()){
                if(produto.getPreco()*produto.getQuantidade() > maiorQuantidadeValor){
                    produtoMaiorQuantidadeValor = produto;
                    maiorQuantidadeValor = produto.getPreco()* produto.getQuantidade();
                }
            }
        }
        return produtoMaiorQuantidadeValor;
    }


}
