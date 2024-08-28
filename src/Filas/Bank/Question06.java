package Filas.Bank;

public class Question06 {
    public static void Execute() {
        System.out.println("Questão 6");

        ServiceQueue serviceQueue = new ServiceQueue();
        serviceQueue.addClient("Cliente 1");
        serviceQueue.addClient("Cliente 2");
        serviceQueue.addClient("Cliente 3");

        System.out.println("Fila de atendimento:");
        serviceQueue.printQueue();

        System.out.println("======================================");

        Client clientServed = serviceQueue.callNextClient();
        System.out.println("Atendendo: " + (clientServed != null ? clientServed.getName() : "Nenhum cliente"));

        System.out.println("======================================");

        System.out.println("Fila de atendimento após chamar o próximo cliente:");
        serviceQueue.printQueue();
        System.out.println();
        System.out.println();
    }
}
