package Filas.ReadyProcessQueue;

public class ProcessQueue {
    private Proc start;
    private Proc end;

    public ProcessQueue() {
        this.start = null;
        this.end = null;
    }

    public void addProcess(String processName) {
        Proc newProc = new Proc(processName);
        if (end == null) {
            start = newProc;
            end = newProc;
        } else {
            end.setNext(newProc);
            end = newProc;
        }
    }

    public Proc executeNextProcess() {
        if (start == null) {
            return null;
        }
        Proc procToExecute = start;
        start = start.getNext();
        if (start == null) {
            end = null;
        }
        return procToExecute;
    }

    public void printQueue() {
        Proc current = start;
        while (current != null) {
            System.out.println(current.getProcessName());
            current = current.getNext();
        }
    }
}