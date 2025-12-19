# 📊 SLA Monitoring - Power BI + Java API
## 📌 Visão Geral

Este projeto tem como objetivo demonstrar a integração entre uma API REST desenvolvida em Java (Spring Boot) e o Power BI, simulando um cenário real de monitoramento de chamados de serviços com foco em SLA, tempo de atendimento e gargalos operacionais.

Os dados são gerados de forma simulada na API e consumidos diretamente pelo Power BI via endpoint HTTP.

## 🏗️ Arquitetura do Projeto
Java (Spring Boot)  
    │   
    ├── API REST (dados simulados)  
    │       └── Endpoint /chamados      
    │   
    └── Power BI    
        ├── Página 1: Visão Geral de Chamados   
        ├── Página 2: Desempenho Operacional    
        └── Página 3: Gargalos Operacionais

## ⚙️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- API REST
- Power BI Desktop
- DAX
- Modelagem Analítica
- Git & GitHub


## 🔌 API - Dados Simulados

A API simula um volume de 1.297 chamados, contendo informações como:

- Status do chamado
- Prioridade
- Responsável
- Datas de abertura, atendimento e fechamento
- Tempo de atendimento e resolução
- SLA (em horas)
- Indicador de cumprimento de SLA

## 📈 Power BI — Dashboards

### 🔹 Página 1 — Visão Geral de Chamados
- Total de chamados
- Percentual de cumprimento de SLA
- Tempo médio de atendimento
- Chamados fora do SLA
- Distribuição por responsável e prioridade
- Evolução temporal dos chamados

---

### 🔹 Página 2 — Desempenho Operacional
- Análise detalhada de SLA
- Tempo médio de resolução
- Distribuição do tempo de resolução por faixas
- Evolução do cumprimento de SLA ao longo do tempo
- Análises comparativas por responsável e prioridade

---

### 🔹 Página 3 — Gargalos Operacionais
- Identificação de responsáveis críticos
- Comparação entre volume de chamados, tempo médio e SLA
- Matriz analítica para diagnóstico operacional
- Análise de gargalos por prioridade

---

## 🎯 Objetivo do Projeto

Este projeto tem caráter **exclusivamente demonstrativo**, com foco em:

- Integração entre API e BI
- Boas práticas de modelagem analítica
- Construção de dashboards voltados à tomada de decisão
- Análise de SLA e eficiência operacional

Nenhum dado real foi utilizado.