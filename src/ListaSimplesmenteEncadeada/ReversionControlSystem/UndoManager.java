package ListaSimplesmenteEncadeada.ReversionControlSystem;

// Classe UndoManager
public class UndoManager {
    private Action head;

    public UndoManager() {
        this.head = null;
    }

    public void addAction(String content) {
        Action newAction = new Action(content);
        if (head == null) {
            head = newAction;
        } else {
            Action current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newAction);
        }
    }

    public void undo() {
        if (head == null) return;

        if (head.getNext() == null) {
            head = null;
            return;
        }

        Action current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }

    public void printActions() {
        Action current = head;
        while (current != null) {
            System.out.println(current.getContent());
            current = current.getNext();
        }
    }
}