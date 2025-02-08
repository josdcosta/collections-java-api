package list.tarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefaList.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
}
