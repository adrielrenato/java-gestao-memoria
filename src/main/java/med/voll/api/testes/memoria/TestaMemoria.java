package med.voll.api.testes.memoria;

import med.voll.api.domain.consulta.model.Consulta;

import java.util.ArrayList;
import java.util.List;

public class TestaMemoria {
    public static void main(String[] args) {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta = new Consulta();

        for (int i = 0; i < 1000000000; i++) {
            consultas.add(consulta);
        }

        // Teste para estourar memoria
        // Deveria usar o page para paginar e não trazer todos os dados para estourar a memoria
    }
}
