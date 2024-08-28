package Filas.ReadyProcessQueue;

public class Question08 {
    public static void Execute() {
        System.out.println("Questão 8");

        ProcessQueue processQueue = new ProcessQueue();
        processQueue.addProcess("Processo 1");
        processQueue.addProcess("Processo 2");
        processQueue.addProcess("Processo 3");

        System.out.println("Fila de processos:");
        processQueue.printQueue();

        System.out.println("======================================");

        Proc processExecuted = processQueue.executeNextProcess();
        System.out.println("Executando: " + (processExecuted != null ? processExecuted.getProcessName() : "Nenhum processo"));

        System.out.println("======================================");

        System.out.println("Fila de processos após executar o próximo processo:");
        processQueue.printQueue();
    }
}
