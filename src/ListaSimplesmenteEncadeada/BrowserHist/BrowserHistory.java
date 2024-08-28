package ListaSimplesmenteEncadeada.BrowserHist;

// Classe BrowserHistory
public class BrowserHistory {
    private URLNode head;
    private int maxSize;
    private int currentSize;

    public BrowserHistory(int maxSize) {
        this.head = null;
        this.maxSize = maxSize;
        this.currentSize = 0;
    }

    public void addURL(String url) {
        URLNode newNode = new URLNode(url);
        if (head == null) {
            head = newNode;
        } else {
            URLNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        currentSize++;
        if (currentSize > maxSize) {
            head = head.getNext();
            currentSize--;
        }
    }

    public void printHistory() {
        URLNode current = head;
        while (current != null) {
            System.out.println(current.getUrl());
            current = current.getNext();
        }
    }
}