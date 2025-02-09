package map.opbasica;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Alice", 321156789);

        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Carlos", 555555555);

        // Exibindo contatos
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        // Pesquisando um contato
        System.out.println("Pesquisando telefone de Bob: " + agenda.pesquisarPorNome("Bob"));

        // Exibindo contatos após a pesquisa
        System.out.println("Contatos na agenda após pesquisa:");
        agenda.exibirContatos();

        // Removendo um contato
        agenda.removerContato("Alice");

        // Exibindo contatos após a remoção
        System.out.println("Contatos na agenda após remoção de Alice:");
        agenda.exibirContatos();
    }
}