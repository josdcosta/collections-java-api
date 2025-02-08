package list;

import list.tarefas.ListaTarefas;

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
        System.out.println(listaTarefas.obterDescricoesTarefas());
        listaTarefas.removerTarefa("Estudar React");
        System.out.println(listaTarefas.obterDescricoesTarefas());
        System.out.println("Total de tarefas:");
        System.out.println(listaTarefas.obterTotalTarefas());
    }
}