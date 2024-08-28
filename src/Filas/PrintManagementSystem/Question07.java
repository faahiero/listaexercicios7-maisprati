package Filas.PrintManagementSystem;

public class Question07 {
    public static void Execute() {
        System.out.println("Questão 7");

        PrintQueue queue = new PrintQueue();
        queue.addPrintJob("Documento 1");
        queue.addPrintJob("Documento 2");
        queue.addPrintJob("Documento 3");

        System.out.println("Fila de impressão:");
        queue.printQueue();

        System.out.println("======================================");

        PrintJob jobProcessed = queue.processNextJob();
        System.out.println("Processando: " + (jobProcessed != null ? jobProcessed.getDocumentName() : "Nenhum trabalho"));

        System.out.println("======================================");

        System.out.println("Fila de impressão após processar o próximo trabalho:");
        queue.printQueue();
        System.out.println();
        System.out.println();
    }
}
