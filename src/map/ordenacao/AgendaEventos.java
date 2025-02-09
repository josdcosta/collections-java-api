package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda(){
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(agendaEventosMap);
        return eventosPorData;
    }

    public Evento obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosPorData = new TreeMap<>(agendaEventosMap);
        Evento proximoEvento = null;
        for(LocalDate eventoData:eventosPorData.keySet()){
            if(eventoData.isAfter(dataAtual)){
                proximoEvento = eventosPorData.get(eventoData);
                break;
            }
        }
        return proximoEvento;
    }

}
