package br.com.sla.chamados_sla_api.service;

import br.com.sla.chamados_sla_api.model.Chamado;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ChamadoService {

    public List<Chamado> listarChamados() {

        List<Chamado> chamados = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 1297; i++) {

            LocalDateTime dataAbertura = LocalDateTime.now()
                    .minusDays(random.nextInt(30))
                    .minusHours(random.nextInt(8));

            int slaHoras = definirSlaPorPrioridade();
            String prioridade = sortearPrioridade(random);

            LocalDateTime dataAtendimento = dataAbertura.plusHours(random.nextInt(3) + 1);
            LocalDateTime dataFechamento = dataAtendimento.plusHours(random.nextInt(10) + 1);

            double tempoAtendimentoHoras = ChronoUnit.MINUTES
                    .between(dataAbertura, dataFechamento) / 60.0;

            boolean dentroSla = tempoAtendimentoHoras <= slaHoras;

            Chamado chamado = new Chamado();
            chamado.setIdChamado((long) i);
            chamado.setDataAbertura(dataAbertura);
            chamado.setDataAtendimento(dataAtendimento);
            chamado.setDataFechamento(dataFechamento);
            chamado.setPrioridade(prioridade);
            chamado.setTipo(sortearTipo(random));
            chamado.setResponsavel(sortearResponsavel(random));
            chamado.setSlaHoras(slaHoras);
            chamado.setTempoAtendimentoHoras(tempoAtendimentoHoras);
            chamado.setDentroSla(dentroSla);
            chamado.setStatus(definirStatus(dataFechamento));

            chamados.add(chamado);
        }

        return chamados;
    }

    private String definirStatus(LocalDateTime dataFechamento) {
        return "Resolvido";
    }

    private String sortearTipo(Random random) {
        return random.nextBoolean() ? "Incidente" : "Solicitação";
    }

    private String sortearPrioridade(Random random) {
        String[] prioridades = {"Baixa", "Média", "Alta"};
        return prioridades[random.nextInt(prioridades.length)];
    }

    private String sortearResponsavel(Random random) {
        String[] equipes = {
                "Suporte N1",
                "Suporte N2",
                "Infraestrutura",
                "Sistemas"
        };
        return equipes[random.nextInt(equipes.length)];
    }

    private int definirSlaPorPrioridade() {
        return 8;
    }
}
