# Estruturas de Dados em Java

Este projeto contém implementações de várias estruturas de dados e algoritmos em Java, organizados em diferentes pacotes.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes principais:

- `Filas`: Implementações relacionadas a filas
- `ListaDuplamenteEncadeada`: Implementações de listas duplamente encadeadas
- `ListaSimplesmenteEncadeada`: Implementações de listas simplesmente encadeadas

## Como executar

Para executar o projeto, execute a classe [`Main`](src/Main.java). Você será apresentado com um menu onde pode escolher qual questão deseja executar.


## Estrutura da execução
1. A classe [`Menu`](src/Menu.java) é responsável por exiber as opções disponíveis para o usuário:
2. A classe [`Main`](src/Main.java) gerencia o fluxo do programa, chamando o método `Execute()` da questão escolhida dentro de um loop while
3. Junto das implementações lógicas dos algorítmos e das estrutudas de dados de cada questão existe uma classe `Question{númeroDaQuestao}`
   (Ex. [`Question06.java`](src/Filas/Bank/Question06.java)) dentro do pacote correspondente, para gerenciar um exemplo de execução. Cada classe é executada de acordo
   com a opção escolhida pelo usuário.

## Questões Implementadas

1. Gerenciador de tarefas
2. Histórico de navegação
3. Sistema de controle de reversão (undo)
4. Sistema de controle de reversão (undo/redo)
5. Jogo de cartas
6. Sistema de atendimento bancário
7. Sistema de gerenciamento de impressão
8. Fila de processos
