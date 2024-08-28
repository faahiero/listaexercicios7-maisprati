package ListaDuplamenteEncadeada.ReversionControlSystem;

public class Action {
    private String content;
    private Action prev;
    private Action next;

    public Action(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }

    public String getContent() {
        return content;
    }

    public Action getPrev() {
        return prev;
    }

    public void setPrev(Action prev) {
        this.prev = prev;
    }

    public Action getNext() {
        return next;
    }

    public void setNext(Action next) {
        this.next = next;
    }
}