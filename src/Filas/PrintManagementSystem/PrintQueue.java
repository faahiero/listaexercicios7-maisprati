package Filas.PrintManagementSystem;

public class PrintQueue {
    private PrintJob start;
    private PrintJob end;

    public PrintQueue() {
        this.start = null;
        this.end = null;
    }

    public void addPrintJob(String documentName) {
        PrintJob newJob = new PrintJob(documentName);
        if (end == null) {
            start = newJob;
            end = newJob;
        } else {
            end.setNext(newJob);
            end = newJob;
        }
    }

    public PrintJob processNextJob() {
        if (start == null) {
            return null;
        }
        PrintJob jobToProcess = start;
        start = start.getNext();
        if (start == null) {
            end = null;
        }
        return jobToProcess;
    }

    public void printQueue() {
        PrintJob current = start;
        while (current != null) {
            System.out.println(current.getDocumentName());
            current = current.getNext();
        }
    }
}