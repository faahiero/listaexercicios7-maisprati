package Filas.Bank;

public class ServiceQueue {
    private Client start;
    private Client end;

    public ServiceQueue() {
        this.start = null;
        this.end = null;
    }

    public void addClient(String name) {
        Client newClient = new Client(name);
        if (end == null) {
            start = newClient;
            end = newClient;
        } else {
            end.setNext(newClient);
            end = newClient;
        }
    }

    public Client callNextClient() {
        if (start == null) {
            return null;
        }
        Client clientServed = start;
        start = start.getNext();
        if (start == null) {
            end = null;
        }
        return clientServed;
    }

    public void printQueue() {
        Client current = start;
        while (current != null) {
            System.out.println(current.getName());
            current = current.getNext();
        }
    }
}
