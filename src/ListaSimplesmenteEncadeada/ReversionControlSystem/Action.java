package ListaSimplesmenteEncadeada.ReversionControlSystem;

// Classe Action
public class Action {
    private String content;
    private Action next;

    public Action(String content) {
        this.content = content;
        this.next = null;
    }

    public String getContent() {
        return content;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }
}