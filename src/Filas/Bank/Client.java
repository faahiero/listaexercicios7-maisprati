package Filas.Bank;

public class Client {
    private String name;
    private Client next;

    public Client(String name) {
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public Client getNext() {
        return next;
    }

    public void setNext(Client next) {
        this.next = next;
    }
}