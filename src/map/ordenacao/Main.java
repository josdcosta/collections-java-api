package map.ordenacao;

import java.time.LocalDate;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Criando a agenda de eventos
        AgendaEventos agenda = new AgendaEventos();

        // Adicionando eventos
        agenda.adicionarEvento(LocalDate.of(2025, 2, 15), "Show de Rock", "Banda X");
        agenda.adicionarEvento(LocalDate.of(2025, 3, 10), "Peça de Teatro", "Companhia Y");
        agenda.adicionarEvento(LocalDate.of(2025, 1, 5), "Exposição de Arte", "Galeria Z");

        // Exibindo agenda ordenada
        System.out.println("Agenda de Eventos:");
        for (Map.Entry<LocalDate, Evento> entry : agenda.exibirAgenda().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Obtendo o próximo evento
        Evento proximoEvento = agenda.obterProximoEvento();
        if (proximoEvento != null) {
            System.out.println("\nPróximo evento: " + proximoEvento);
        } else {
            System.out.println("\nNão há eventos futuros.");
        }
    }
}