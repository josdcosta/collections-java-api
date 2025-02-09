package set.opbasica;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        // Adicionando convidados
        conjunto.adicionarConvidado("Alice", 101);
        conjunto.adicionarConvidado("Bob", 102);
        conjunto.adicionarConvidado("Marcos", 102);
        conjunto.adicionarConvidado("Carlos", 103);

        // Exibindo a quantidade de convidados
        System.out.println("Número de convidados: " + conjunto.contarConvidados());

        // Exibindo os convidados
        System.out.println("Lista de convidados:");
        conjunto.exibirConvidados();

        // Removendo um convidado
        conjunto.removerConvidadoPorCodigoConvite(102);
        System.out.println("\nApós remoção do convidado com código 102:");
        conjunto.exibirConvidados();

        // Exibindo a quantidade de convidados após remoção
        System.out.println("Número de convidados após remoção: " + conjunto.contarConvidados());
    }
}