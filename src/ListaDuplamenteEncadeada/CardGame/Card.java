package ListaDuplamenteEncadeada.CardGame;

public class Card {
    private String value;
    private Card prev;
    private Card next;

    public Card(String value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public Card getPrev() {
        return prev;
    }

    public void setPrev(Card prev) {
        this.prev = prev;
    }

    public Card getNext() {
        return next;
    }

    public void setNext(Card next) {
        this.next = next;
    }
}