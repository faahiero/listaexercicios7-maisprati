package ListaDuplamenteEncadeada.ReversionControlSystem;

public class UndoRedoManager {
    private Action current;

    public UndoRedoManager() {
        this.current = null;
    }

    public void addAction(String content) {
        Action newAction = new Action(content);
        if (current == null) {
            current = newAction;
        } else {
            newAction.setPrev(current);
            if (current.getNext() != null) {
                current.getNext().setPrev(null);
            }
            current.setNext(newAction);
            current = newAction;
        }
    }

    public void undo() {
        if (current != null && current.getPrev() != null) {
            current = current.getPrev();
        }
    }

    public void redo() {
        if (current != null && current.getNext() != null) {
            current = current.getNext();
        }
    }

    public void printActions() {
        Action first = current;
        while (first != null && first.getPrev() != null) {
            first = first.getPrev();
        }
        while (first != null) {
            System.out.println(first.getContent());
            first = first.getNext();
        }
    }
}