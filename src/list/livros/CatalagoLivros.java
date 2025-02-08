package list.livros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalagoLivros {
    private List<Livro> catalogo;

    public CatalagoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public  List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro:catalogo) {
            if(livro.getAutor().contains(autor)){
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicil, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        for (Livro livro:catalogo) {
            if(livro.getAnoPublicacao() >= anoInicil && livro.getAnoPublicacao() <= anoFinal){
                livrosPorIntervalo.add(livro);
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroAutor = null;
        for (Livro livro:catalogo) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroAutor = livro;
                break;
            }
        }
        return livroAutor;
    }

}
