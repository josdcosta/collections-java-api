package list.opbasica;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar DevOps");
        listaTarefas.adicionarTarefa("Estudar Angular");
        listaTarefas.adicionarTarefa("Estudar React");
        listaTarefas.adicionarTarefa("Estudar React");
        System.out.println("Total de tarefas:");
        System.out.println(listaTarefas.obterTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("Estudar React");
        listaTarefas.obterDescricoesTarefas();
        System.out.println("Total de tarefas:");
        System.out.println(listaTarefas.obterTotalTarefas());
    }
}