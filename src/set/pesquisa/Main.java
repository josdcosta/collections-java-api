package set.pesquisa;

public class Main {
    public static void main(String[] args) {
        // Criando a agenda
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", 123456);
        agenda.adicionarContato("Bob", 654321);
        agenda.adicionarContato("Alice", 987654); // Testando contato duplicado

        // Exibindo contatos
        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        // Pesquisando contatos por nome
        System.out.println("\nPesquisando por 'Alice':");
        System.out.println(agenda.pesquisarPorNome("Alice"));

        // Atualizando número de um contato
        System.out.println("\nAtualizando número do contato 'Bob' para 111111:");
        agenda.atualizarNumeroContato("Bob", 111111);
        agenda.exibirContatos();
    }
}