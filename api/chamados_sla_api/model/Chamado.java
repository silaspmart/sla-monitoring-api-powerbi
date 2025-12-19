package br.com.sla.chamados_sla_api.model;

import java.time.LocalDateTime;

public class Chamado {

    private Long idChamado;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataAtendimento;
    private LocalDateTime dataFechamento;

    private String status;        // Aberto | Em atendimento | Resolvido
    private String tipo;          // Incidente | Solicitação
    private String prioridade;    // Baixa | Média | Alta
    private String responsavel;   // Equipe ou analista

    private Integer slaHoras;     // SLA definido
    private Double tempoAtendimentoHoras; // Tempo real até resolução
    private Boolean dentroSla;    // true = dentro do SLA

    public Chamado() {
    }

    public Long getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Long idChamado) {
        this.idChamado = idChamado;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDateTime dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getSlaHoras() {
        return slaHoras;
    }

    public void setSlaHoras(Integer slaHoras) {
        this.slaHoras = slaHoras;
    }

    public Double getTempoAtendimentoHoras() {
        return tempoAtendimentoHoras;
    }

    public void setTempoAtendimentoHoras(Double tempoAtendimentoHoras) {
        this.tempoAtendimentoHoras = tempoAtendimentoHoras;
    }

    public Boolean getDentroSla() {
        return dentroSla;
    }

    public void setDentroSla(Boolean dentroSla) {
        this.dentroSla = dentroSla;
    }
}