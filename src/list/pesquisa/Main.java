package list.pesquisa;

public class Main {
    public static void main(String[] args) {

    CatalagoLivros catalogo = new CatalagoLivros();

    catalogo.adicionarLivro("Matematica", "Pedro L.", 2020 );
    catalogo.adicionarLivro("Estatitisca", "Carlos A.", 2019 );
    catalogo.adicionarLivro("Português", "João P.", 2018 );

    System.out.println(catalogo.pesquisarPorAutor("Pedro"));
    System.out.println(catalogo.pesquisarPorTitulo("Portu"));
    System.out.println(catalogo.pesquisarPorIntervaloAnos(2018, 2019));

    }
}