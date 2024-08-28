package Filas.ReadyProcessQueue;

public class Proc {
    private String processName;
    private Proc next;

    public Proc(String processName) {
        this.processName = processName;
        this.next = null;
    }

    public String getProcessName() {
        return processName;
    }

    public Proc getNext() {
        return next;
    }

    public void setNext(Proc next) {
        this.next = next;
    }
}